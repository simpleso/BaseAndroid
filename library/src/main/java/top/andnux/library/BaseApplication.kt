package top.andnux.library

import android.app.Application
import android.app.Instrumentation
import android.content.Context
import android.support.multidex.MultiDex
import org.jetbrains.anko.doAsync
import top.andnux.library.utils.LogUtil
import top.andnux.library.utils.ChrInstrumentation


class BaseApplication : Application() {

    companion object {
        var dexLoadDone: Boolean = false//标示非主Dex有没有被加载成功
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        hookInstrumentation()
        doAsync {
            val start = System.currentTimeMillis()
            MultiDex.install(this@BaseApplication)
            val end = System.currentTimeMillis()
            LogUtil.e(obj = (end - start))
            dexLoadDone = true
        }
    }

    private fun hookInstrumentation() {
        try {
            val activityThreadClass = Class.forName("android.app.ActivityThread")
            val currentActivityThreadMethod = activityThreadClass.getDeclaredMethod("currentActivityThread")
            currentActivityThreadMethod.isAccessible = true
            //通过currentActivityThread这个静态的方法获取到ActivityThread的实例对象。
            val currentActivityThread = currentActivityThreadMethod.invoke(null)
            // 拿到原始的 mInstrumentation字段
            val mInstrumentationField = activityThreadClass.getDeclaredField("mInstrumentation")
            mInstrumentationField.isAccessible = true
            val mInstrumentation = mInstrumentationField.get(currentActivityThread) as Instrumentation
            // 创建代理对象
            val chrInstrumentation = ChrInstrumentation(mInstrumentation)
            // 替换
            mInstrumentationField.set(currentActivityThread, chrInstrumentation)
        } catch (e: Exception) {
            LogUtil.e(obj = "hookInstrumentation Exception")
        }
    }

    override fun onCreate() {
        super.onCreate()
    }
}