package com.macyang.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.macyang.utils.RequestListener

/**
 * 有网络请求的activity基类
 * Created by tengfei.lv on 2017/8/28.
 */
abstract class BaseNetActivity<out P:BasePresenter, in T>: AppCompatActivity(),RequestListener<T>,BaseView {

    private lateinit var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = createPresenter()
        presenter.attachView(this)
    }

    abstract fun createPresenter():P

    override fun start() {
        showLoadDialog()
    }

    override fun onFinish() {
        hideLoadDialog()
    }

    override fun showLoadDialog() {
    }

    override fun hideLoadDialog() {
    }

    override fun showErrorDialog() {
    }

    override fun showEmptyDialog() {
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}