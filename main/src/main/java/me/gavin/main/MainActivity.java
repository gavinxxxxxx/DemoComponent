package me.gavin.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import me.gavin.main.databinding.MainActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity_main);
        binding.btn3.setOnClickListener(v -> {
            ARouter.getInstance().build("/daily/index").navigation();
        });
    }
}
