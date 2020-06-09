package com.cymjoe.mvpjava.contract;

import com.cymjoe.mvpjava.base.BaseView;

public interface MainContract {
    interface Model {
        /**
         * @param comPressPath 压缩输出路径
         * @param imgPath      图片路径
         * @param inSampleSize 压缩比例
         * @return
         */
        boolean comPress(String comPressPath, String imgPath, int inSampleSize);

    }

    interface View extends BaseView {

        //压缩输出路径
        String comPressPath();

        //图片路径
        String imgPath();

    }

    interface Presenter {


        /**
         * 压缩图片
         *
         * @param inSampleSize 压缩比例
         */
        void comPress(int inSampleSize);
    }
}
