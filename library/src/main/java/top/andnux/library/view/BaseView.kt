package top.andnux.library.view

interface BaseView {

    /**
     * 显示成功消息
     */
    fun showSuccess(text: String = "成功")

    /**
     * 显示错误消息
     */
    fun showError(text: String = "错误")

    /**
     * 显示加载中。。。
     */
    fun showLoading(text: String = "加载中...")

    /**
     * 隐藏加载中。。。
     */
    fun hideLoading()

    /**
     * 显示错误页面
     */
    fun showErrorPage()

    /**
     * 显示成功
     */
    fun showSuccessPage()
}