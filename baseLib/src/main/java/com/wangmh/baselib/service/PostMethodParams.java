package com.wangmh.baselib.service;

public class PostMethodParams {
    public String name = "";
    public Object[] params = null;

    public PostMethodParams() {
    }

    public PostMethodParams(String name) {
        this.name = name;
    }

    public PostMethodParams(String name, Object[] params) {
        this.name = name;
        this.params = params;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
