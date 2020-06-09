package com.cymjoe.mvpjava.base;

import android.view.View;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public abstract class BasePresenter<T> {
    Reference<T> viewRef;

    public void attachView(T view) {
        viewRef = new SoftReference<T>(view);
    }

    protected T getView() {
        return viewRef.get();
    }

    public boolean isViewAttached() {
        return viewRef != null && viewRef.get() != null;
    }

    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
        }
    }
}
