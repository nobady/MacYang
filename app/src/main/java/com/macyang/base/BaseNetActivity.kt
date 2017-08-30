package com.macyang.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hss01248.dialog.StyledDialog
import com.hss01248.dialog.interfaces.MyDialogListener
import com.macyang.utils.RequestListener

/**
 * 有网络请求的activity基类
 * Created by tengfei.lv on 2017/8/28.
 */
abstract class BaseNetActivity<V:BaseView,P : BasePresenter<V>,in T> : AppCompatActivity(), RequestListener<T>, BaseView {
    var presenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = createPresenter()
        presenter?.attachView(this as V)
    }

    abstract fun createPresenter(): P

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
                    finish()
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
                    finish()
                }
            }).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView()
    }
}