package me.gavin.daily.inject.component;

import dagger.Component;
import me.gavin.daily.DailyActivity;
import me.gavin.daily.inject.moodule.DailyModule;
import me.gavin.daily.inject.scope.Daily;
import me.gavin.inject.component.ApplicationComponent;

/**
 * ApplicationComponent
 *
 * @author gavin.xiong 2017/4/28
 */
@Daily
@Component(modules = DailyModule.class, dependencies = ApplicationComponent.class)
public abstract class DailyComponent {

    public static DailyComponent get() {
        return Hold.sComponent;
    }

    private static final class Hold {
        private static final DailyComponent sComponent = DaggerDailyComponent
                .builder()
                .applicationComponent(ApplicationComponent.get())
                .build();
    }

    public abstract void inject(DailyActivity activity);

}
