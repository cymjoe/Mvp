package com.cymjoe.mvpjava.base;

public interface BaseView {
    //显示加载框
    void showLoading();

    //隐藏加载框
    void hintLoading();

    //显示错误弹窗
    void showErrorView(String error);

    //显示空视图
    void showEmptyView(String empty);

    //展示toast
    void showToast(String msg);

}
