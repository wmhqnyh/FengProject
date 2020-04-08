package com.wangmh.baselib.service;

import android.os.Bundle;

public class PostMan {
    public String name = "";
    public Bundle bundle = null;

    public PostMan(String name) {
        this.name = name;
    }

    public PostMan(String name, Bundle bundle) {
        this.name = name;
        this.bundle = bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public void setName(String name) {
        this.name = name;
    }
}
