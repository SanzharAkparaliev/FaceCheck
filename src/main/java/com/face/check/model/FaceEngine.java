package com.face.check.model;

import java.util.List;

public class FaceEngine {
    public static final int F_OX = 0;
    public static final int F_LICENSE_KEY_ERROR = -1;
    public static final int F_LICENSE_APPID_ERROR = -2;
    public static final int F_LICENSE_EXPIRED = -3;
    public static final int F_INIT_ERROR = -4;
    public static FaceEngine instance;

    public static FaceEngine getInstance(){
        return instance;
    }

    public native int setActivation(String var1);

    public native int init();
    public native int uninit();


    public native List<FaceResult> detectFaceFromYuv(byte[] var1, int var2, int var3, int var4);


    public native int extractFeatureFromYuv(byte[] var1, int var2, int var3, int var4, List<FaceResult> var5);

    public native float compareFeature(byte[] var1, byte[] var2);

    static {
        System.loadLibrary("ttvfacesdk");
    }
}
