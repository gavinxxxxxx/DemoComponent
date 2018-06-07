package me.gavin.component;

import com.alibaba.android.arouter.launcher.ARouter;

import me.gavin.common.base.BaseApp;


public class App extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        if (me.gavin.common.BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
