package top.andnux.library.utils

import android.util.Log
import com.alibaba.fastjson.JSON
import top.andnux.library.BuildConfig
import top.andnux.library.extend.toJSONString

class LogUtil {

    companion object {
        fun i(tag: String = "andnux", obj: Any?): Unit {
            if (BuildConfig.DEBUG) {
                val json = JSON.toJSONString(obj)
                Log.i(tag, json)
            }
        }

        fun v(tag: String = "andnux", obj: Any?): Unit {
            if (BuildConfig.DEBUG) {
                val json = JSON.toJSONString(obj)
                Log.v(tag, json)
            }
        }

        fun d(tag: String = "andnux", obj: Any?): Unit {
            if (BuildConfig.DEBUG) {
                val json = JSON.toJSONString(obj)
                Log.d(tag, json)
            }
        }

        fun e(tag: String = "andnux", obj: Any?): Unit {
            if (BuildConfig.DEBUG) {
                val json = JSON.toJSONString(obj)
                Log.e(tag, json)
            }
        }

        fun w(tag: String = "andnux", obj: Any?): Unit {
            if (BuildConfig.DEBUG) {
                val json = JSON.toJSONString(obj)
                Log.w(tag, json)
            }
        }
    }
}
