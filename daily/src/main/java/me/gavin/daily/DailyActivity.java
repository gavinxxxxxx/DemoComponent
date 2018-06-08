package me.gavin.daily;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.gavin.daily.inject.component.DailyComponent;
import me.gavin.daily.net.ClientAPI;
import me.gavin.util.L;
import retrofit2.Retrofit;

@Route(path = "/daily/index")
public class DailyActivity extends DailyActivityTwo<me.gavin.daily.databinding.DailyActivityMainBinding> {

    @Inject
    ClientAPI clientAPI;

    @Inject
    Retrofit retrofit;

    @Override
    protected int getLayoutId() {
        return R.layout.daily_activity_main;
    }

    @Override
    protected void afterCreate(@Nullable Bundle savedInstanceState) {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DailyComponent.get().inject(this);

        L.e(clientAPI);
        L.e(retrofit);
        L.e(mCompositeDisposable);

        clientAPI.getDaily()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(L::e, L::e);
    }
}
