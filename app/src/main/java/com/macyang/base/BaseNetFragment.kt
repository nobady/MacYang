package com.macyang.base

import android.app.Dialog
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hss01248.dialog.StyledDialog
import com.hss01248.dialog.interfaces.MyDialogListener
import com.macyang.R
import com.macyang.utils.RequestListener

/**
 * Created by tengfei.lv on 2017/8/29.
 */
abstract class BaseNetFragment<V : BaseView, P : BasePresenter<V>, in T> : Fragment(), BaseView, RequestListener<T> {

    var presenter: P? = null

    var aaa : Int = 0

    abstract fun createPresenter(): P

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(getLayout(), container, false)
        return view
    }

    @LayoutRes abstract fun getLayout(): Int

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = createPresenter()
        presenter?.attachView((BaseView@ this) as V)
    }

    abstract fun requestData()

    override fun start() {
        showLoadDialog()
    }

    override fun onFinish() {
        hideLoadDialog()
    }


    override fun showLoadDialog() {
        StyledDialog.buildMdLoading("玩命加载中...").show()
    }

    override fun hideLoadDialog() {
        StyledDialog.dismissLoading()
    }

    override fun showErrorDialog(msg: String) {
        StyledDialog.buildMdLoading(msg).setBtnText("退出", "重试").setListener(
                object : MyDialogListener() {
                    override fun onSecond() {
                        requestData()
                        StyledDialog.dismissLoading()
                    }

                    override fun onFirst() {
                    }
                }).show()
    }

    override fun showEmptyDialog(msg: String) {
        StyledDialog.buildMdLoading(msg).setBtnText("退出", "重试").setListener(
                object : MyDialogListener() {
                    override fun onSecond() {
                        requestData()
                        StyledDialog.dismissLoading()
                    }

                    override fun onFirst() {
                    }
                }).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView()
    }

}