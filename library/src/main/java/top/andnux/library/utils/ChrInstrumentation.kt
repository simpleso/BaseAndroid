package top.andnux.library.utils

import android.app.Activity
import android.app.Instrumentation
import android.content.Context
import android.content.Intent
import android.util.Log
import top.andnux.library.BaseApplication
import top.andnux.library.activity.LoadDexActivity
import java.lang.reflect.Method


class ChrInstrumentation(val mBase: Instrumentation)
    : Instrumentation() {

    override fun newActivity(cl: ClassLoader?, className: String?, intent: Intent?): Activity {
        var tmpClassName = className ?: ""
        if (!BaseApplication.dexLoadDone) {
            //没有完成MultiDex的加载，就替换显示Activity。
            tmpClassName = LoadDexActivity::class.java.getName()
            LogUtil.i("lz", "未完成，重定向")
        }
        return super.newActivity(cl, className, intent)
    }
}
