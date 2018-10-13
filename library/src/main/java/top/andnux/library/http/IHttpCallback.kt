package top.andnux.library.http

import java.io.InputStream

interface IHttpCallback {

    fun onSuccess(data: InputStream)

    fun onFail(msg: String)

    fun onComplete()
}