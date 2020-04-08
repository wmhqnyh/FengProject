package com.wangmh.mhproject;

import android.app.Application;
import android.content.Context;

import com.wangmh.baselib.ServiceModule;
import com.wangmh.baselib.service.ServiceCenterManager;
import com.wangmh.mainlib.IMainServiceImpl;
import com.wangmh.userlib.IUserServiceImpl;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/4/5 12:14 AM
*   @desc   :
* </pre>
*/
public class FengApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initService();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    private void initService() {
        ServiceCenterManager.addService(ServiceModule.MAIN_MODULE, new IMainServiceImpl());
        ServiceCenterManager.addService(ServiceModule.USER_MODULE, new IUserServiceImpl());
    }

    /**
     * 在应用主进程才初始化的操作。
     */
//    private void initMainProcess() {
//        String currentProccessName = Utils.getCurrentProcessName(getApplicationContext());
//        if (Utils.isStringEquals(this.getPackageName(), currentProccessName)) {
//            initProxy();
//            initService();
//        }
//    }
}
