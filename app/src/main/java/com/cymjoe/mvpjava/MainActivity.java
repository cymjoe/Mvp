package com.cymjoe.mvpjava;

import android.os.Bundle;

import com.cymjoe.mvpjava.base.BaseActivity;
import com.cymjoe.mvpjava.contract.MainContract;
import com.cymjoe.mvpjava.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainContract.View, MainPresenter<MainContract.View>> implements MainContract.View {


    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        presenter.comPress(2);

    }

    @Override
    protected MainPresenter<MainContract.View> createPresenter() {
        return new MainPresenter<>();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public String comPressPath() {
        //示例
        return "comPressPath";
    }

    @Override
    public String imgPath() {
        //示例
        return "imgPath";
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hintLoading() {

    }

    @Override
    public void showErrorView(String error) {

    }

    @Override
    public void showEmptyView(String empty) {

    }

    @Override
    public void showToast(String msg) {

    }
}
