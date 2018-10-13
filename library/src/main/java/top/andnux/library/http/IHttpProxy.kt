package top.andnux.library.http

import java.io.File

interface IHttpProxy {

    fun get(url: String,
            showLoading: Boolean = true,
            parameter: Map<String, Any>? = null,
            header: Map<String, String>? = null,
            callback: IHttpCallback? = null
    )

    fun putForm(url: String,
            showLoading: Boolean = true,
            parameter: Map<String, Any>? = null,
            header: Map<String, String>? = null,
            callback: IHttpCallback? = null
    )

    fun putBody(url: String,
               showLoading: Boolean = true,
               parameter: Map<String, Any>? = null,
               header: Map<String, String>? = null,
               callback: IHttpCallback? = null
    )

    fun postForm(url: String,
             showLoading: Boolean = true,
             parameter: Map<String, Any>? = null,
             header: Map<String, String>? = null,
             callback: IHttpCallback? = null
    )

    fun postBody(url: String,
                showLoading: Boolean = true,
                parameter: Map<String, Any>? = null,
                header: Map<String, String>? = null,
                callback: IHttpCallback? = null
    )

    fun upload(url: String,
               showLoading: Boolean = true,
               parameter: Map<String, Any>? = null,
               files: List<Map<String, File>>? = null,
               header: Map<String, String>? = null,
               callback: IHttpCallback? = null
    )

    fun download(url: String,
                 dirs: String,
                 callback: IHttpCallback? = null)
}