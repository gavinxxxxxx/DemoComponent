package me.gavin.inject.component;

import android.app.Application;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import io.reactivex.disposables.CompositeDisposable;
import me.gavin.base.BaseActivity;
import me.gavin.inject.module.ApplicationModule;
import retrofit2.Retrofit;

/**
 * ApplicationComponent
 *
 * @author gavin.xiong 2017/4/28
 */
@Singleton
@Component(modules = ApplicationModule.class)
public abstract class ApplicationComponent {

    private static ApplicationComponent sComponent;

    public static void set(@NonNull ApplicationComponent component) {
        sComponent = component;
    }

    @NonNull
    public static ApplicationComponent get() {
        if (sComponent == null) {
            throw new NullPointerException("Must first call the set method");
        }
        return sComponent;
    }

    public abstract void inject(BaseActivity activity);

//    void inject(BaseFragment fragment);
//
//    void inject(BaseViewModel viewModel);

//    void inject(BaseDialogFragment dialogFragment);

//    void inject(BaseManager manager);

    public abstract Application getApplication();

    public abstract Retrofit getRetrofit();

    public abstract CompositeDisposable getCompositeDisposable();
}
