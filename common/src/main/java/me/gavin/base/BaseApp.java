package me.gavin.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import me.gavin.BuildConfig;
import me.gavin.inject.component.ApplicationComponent;
import me.gavin.inject.component.DaggerApplicationComponent;
import me.gavin.inject.module.ApplicationModule;


public abstract class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
        initDagger();
    }

    private void initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
        initDagger();
    }

    private void initDagger() {
        ApplicationComponent.set(DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build());
    }

}
