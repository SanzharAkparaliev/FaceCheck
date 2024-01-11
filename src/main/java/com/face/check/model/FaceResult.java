package com.face.check.model;

public class FaceResult {
    public int left;
    public int top;
    public int right;
    public int bottom;
    public byte[] feature;
    public float[] landmark;
    public float liveness;
    public float yaw;
    public float pitch;
    public float roll;
    public float quality;

    public FaceResult(int left, int top, int right, int bottom, float liveness, float yaw, float pitch, float roll, float quality, byte[] feature, float[] landmark) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.feature = feature;
        this.landmark = landmark;
        this.liveness = liveness;
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
        this.quality = quality;
    }
}
