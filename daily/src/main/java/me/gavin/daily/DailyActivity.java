package me.gavin.daily;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

import me.gavin.daily.databinding.DailyActivityMainBinding;

@Route(path = "/daily/index")
public class DailyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DailyActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.daily_activity_main);
        binding.btn2.setOnClickListener(v -> {

        });
    }

}
