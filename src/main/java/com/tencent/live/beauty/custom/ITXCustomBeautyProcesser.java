package com.tencent.live.beauty.custom;

import static com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyBufferType;
import static com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyPixelFormat;
import static com.tencent.live.beauty.custom.TXCustomBeautyDef.TXCustomBeautyVideoFrame;

public interface ITXCustomBeautyProcesser {

    TXCustomBeautyPixelFormat getSupportedPixelFormat();

    TXCustomBeautyBufferType getSupportedBufferType();

    void onProcessVideoFrame(TXCustomBeautyVideoFrame srcFrame, TXCustomBeautyVideoFrame dstFrame);
}
