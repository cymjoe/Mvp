package com.cymjoe.mvpjava.presenter;

import android.util.Log;

import com.cymjoe.mvpjava.base.BasePresenter;
import com.cymjoe.mvpjava.base.BaseView;
import com.cymjoe.mvpjava.contract.MainContract;
import com.cymjoe.mvpjava.model.MainModel;

public class MainPresenter<V extends BaseView> extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private static final String TAG = MainPresenter.class.getName();

    private MainContract.Model model;

    public MainPresenter() {
        model = new MainModel();
    }

    /**
     * @param inSampleSize 压缩比例
     */
    @Override
    public void comPress(int inSampleSize) {
        if (!isViewAttached()) {
            return;
        }

//        model.comPress(getView().comPressPath(), getView().imgPath(), inSampleSize);
        Log.d(TAG, getView().comPressPath() + "\n" + getView().imgPath() + "\n" + inSampleSize);
    }
}
