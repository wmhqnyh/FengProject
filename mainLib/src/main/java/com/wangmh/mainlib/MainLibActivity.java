package com.wangmh.mainlib;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wangmh.baselib.IUserService;
import com.wangmh.baselib.ServiceModule;
import com.wangmh.baselib.service.ServiceCenterManager;

public class MainLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        IUserService iUserService = (IUserService) ServiceCenterManager.getService(ServiceModule.USER_MODULE);
        if (iUserService != null) {
            iUserService.userLibMethod();
        }

    }
}
