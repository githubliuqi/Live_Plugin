package com.tencent.live.beauty.custom;

public interface ITXCustomBeautyProcesserFactory {

    /**
     * 创建美颜实例
     * @return
     */
    ITXCustomBeautyProcesser createCustomBeautyProcesser();

    /**
     * 销毁美颜实例
     */
    void destroyCustomBeautyProcesser();
}
