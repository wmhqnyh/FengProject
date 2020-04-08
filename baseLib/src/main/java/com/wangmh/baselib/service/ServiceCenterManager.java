package com.wangmh.baselib.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceCenterManager {
    public static Map<String, IService> map = new HashMap();

    public ServiceCenterManager() {
    }

    public static void addService(String key, IService service) {
        synchronized(map) {
            map.put(key, service);
        }
    }

    public static IService getService(String name) {
        if (map.get(name) == null) {
            throw new NullPointerException("没有注册对应的服务");
        } else {
            return (IService)map.get(name);
        }
    }
}