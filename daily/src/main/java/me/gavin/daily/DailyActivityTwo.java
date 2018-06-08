package me.gavin.daily;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import me.gavin.base.BindingActivity;
import me.gavin.daily.inject.component.DaggerDailyComponent;

public abstract class DailyActivityTwo<T extends ViewDataBinding> extends BindingActivity<T> {

//    @Inject
//    CompositeDisposable compositeDisposable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        DaggerDailyComponent.get().inject(this);
    }
}
