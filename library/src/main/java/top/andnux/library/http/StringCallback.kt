package top.andnux.library.http

import top.andnux.library.extend.string
import java.io.InputStream

abstract class StringCallback : BaseHttpCallback() {

    override fun onSuccess(data: InputStream) {
        val string = data.string()
        onSuccess(string)
    }

    abstract fun onSuccess(data: String)
}