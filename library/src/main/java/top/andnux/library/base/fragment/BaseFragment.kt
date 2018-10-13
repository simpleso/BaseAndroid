package top.andnux.library.base.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import top.andnux.library.annotation.BindView

open abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val bindView = this.javaClass.getAnnotation(BindView::class.java)
        val value = bindView?.value ?: 0
        var view = super.onCreateView(inflater, container, savedInstanceState)
        if (value > 0) {
            view = inflater.inflate(value, container, false)
        }
        return view
    }

    abstract fun initViews(view: View, savedInstanceState: Bundle?): Unit

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view, savedInstanceState)
    }
}