package top.andnux.library.base.activity

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import top.andnux.library.annotation.BindView

open abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectView(this)
    }

    private fun injectView(activity: Activity) {
        val bindView = activity.javaClass.getAnnotation(BindView::class.java)
        val value = bindView?.value ?: 0
        if (value > 0) {
            setContentView(value)
        }
    }

    abstract fun initViews(view: View, savedInstanceState: Bundle?): Unit
}