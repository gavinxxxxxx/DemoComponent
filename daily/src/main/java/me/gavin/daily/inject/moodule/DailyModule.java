package me.gavin.daily.inject.moodule;

import dagger.Module;
import dagger.Provides;
import me.gavin.daily.inject.scope.Daily;
import me.gavin.daily.net.ClientAPI;
import retrofit2.Retrofit;

/**
 * ApplicationModule
 *
 * @author gavin.xiong 2017/4/28
 */
@Module
public class DailyModule {

    /**
     * 提供Application单例对象
     *
     * @return Application
     */
    @Daily
    @Provides
    ClientAPI provideDailyAPI(Retrofit retrofit) {
        return retrofit.create(ClientAPI.class);
    }
}
