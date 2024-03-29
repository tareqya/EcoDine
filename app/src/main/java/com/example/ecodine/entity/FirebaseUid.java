package com.example.ecodine.entity;

import com.google.firebase.firestore.Exclude;

import java.io.Serializable;

public class FirebaseUid implements Serializable {
    protected String uid;

    public FirebaseUid(){

    }
    @Exclude
    public String getUid() {
        return uid;
    }

    public FirebaseUid setUid(String uid) {
        this.uid = uid;
        return this;
    }
}
