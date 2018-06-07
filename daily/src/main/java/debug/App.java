package debug;

import com.alibaba.android.arouter.launcher.ARouter;

import me.gavin.common.BuildConfig;
import me.gavin.common.base.BaseApp;


public class App extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

}
