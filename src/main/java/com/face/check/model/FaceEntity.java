package com.face.check.model;

import java.awt.image.BufferedImage;

public class FaceEntity {

    public String userName;
    public BufferedImage headImg;
    public byte[] feature;
    public int user_id;

    public FaceEntity() {

    }

    public FaceEntity(int user_id, String userName, BufferedImage headImg, byte[] feature) {
        this.user_id = user_id;
        this.userName = userName;
        this.headImg = headImg;
        this.feature = feature;
    }
}