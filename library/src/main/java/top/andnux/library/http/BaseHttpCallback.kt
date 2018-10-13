package top.andnux.library.http

import java.io.InputStream

open class BaseHttpCallback : IHttpCallback{

    override fun onSuccess(data: InputStream) {

    }

    override fun onFail(msg: String) {

    }

    override fun onComplete() {

    }
}