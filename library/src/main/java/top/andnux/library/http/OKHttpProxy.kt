package top.andnux.library.http

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import top.andnux.library.extend.closeQuietly
import top.andnux.library.extend.toGetString
import java.io.*
import java.net.HttpURLConnection
import java.net.URL

class OKHttpProxy : IHttpProxy {

    override fun get(url: String, showLoading: Boolean, parameter: Map<String, Any>?, header: Map<String, String>?, callback: IHttpCallback?) {


    }

    override fun putForm(url: String, showLoading: Boolean, parameter: Map<String, Any>?, header: Map<String, String>?, callback: IHttpCallback?) {

    }

    override fun putBody(url: String, showLoading: Boolean, parameter: Map<String, Any>?, header: Map<String, String>?, callback: IHttpCallback?) {

    }

    override fun postForm(url: String, showLoading: Boolean, parameter: Map<String, Any>?, header: Map<String, String>?, callback: IHttpCallback?) {

    }

    override fun postBody(url: String, showLoading: Boolean, parameter: Map<String, Any>?, header: Map<String, String>?, callback: IHttpCallback?) {

    }

    override fun upload(url: String, showLoading: Boolean, parameter: Map<String, Any>?, files: List<Map<String, File>>?, header: Map<String, String>?, callback: IHttpCallback?) {

    }

    override fun download(url: String, dirs: String, callback: IHttpCallback?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}