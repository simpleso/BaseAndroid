package top.andnux.library.manager

import top.andnux.library.http.IHttpCallback
import top.andnux.library.http.IHttpProxy
import top.andnux.library.http.OKHttpProxy
import java.io.File

object HttpManager {

    var proxy: IHttpProxy? = null

    fun get(url: String,
            showLoading: Boolean = false,
            parameter: Map<String, Any>? = null,
            header: Map<String, String>? = null,
            callback: IHttpCallback? = null) {


    }

    fun putForm(url: String,
                showLoading: Boolean = false,
                parameter: Map<String, Any>? = null,
                header: Map<String, String>? = null,
                callback: IHttpCallback? = null) {

    }

    fun putBody(url: String,
                showLoading: Boolean = false,
                parameter: Map<String, Any>? = null,
                header: Map<String, String>? = null,
                callback: IHttpCallback? = null) {

    }

    fun postForm(url: String,
                 showLoading: Boolean = false,
                 parameter: Map<String, Any>? = null,
                 header: Map<String, String>? = null,
                 callback: IHttpCallback? = null) {

    }

    fun postBody(url: String,
                 showLoading: Boolean = false,
                 parameter: Map<String, Any>? = null,
                 header: Map<String, String>? = null,
                 callback: IHttpCallback? = null) {

    }

    fun upload(url: String,
               showLoading: Boolean = false,
               parameter: Map<String, Any>? = null,
               files: List<Map<String, File>>? = null,
               header: Map<String, String>? = null,
               callback: IHttpCallback? = null) {

    }

    fun download(url: String,
                 dirs: String,
                 callback: IHttpCallback? = null) {

    }


}