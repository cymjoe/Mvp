package com.cymjoe.mvpjava.model;

import com.cymjoe.mvpjava.contract.MainContract;
import com.cymjoe.mvpjava.utils.CompressUtils;

public class MainModel implements MainContract.Model {

    /**
     *
     * @param comPressPath 压缩输出路径
     * @param imgPath      图片路径
     * @param inSampleSize 压缩比例
     * @return
     */
    @Override
    public boolean comPress(String comPressPath, String imgPath, int inSampleSize) {
        return CompressUtils.compress(comPressPath,imgPath,inSampleSize);
    }
}
