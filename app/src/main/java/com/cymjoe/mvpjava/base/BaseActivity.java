package com.cymjoe.mvpjava.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<V extends BaseView, T extends BasePresenter<V>> extends AppCompatActivity {

    public T presenter;

    Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        presenter = createPresenter();
        presenter.attachView((V) this);
        initView(savedInstanceState);
        initData();
    }

    protected abstract void initView(Bundle savedInstanceState);

    protected abstract void initData();

    protected abstract T createPresenter();

    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
