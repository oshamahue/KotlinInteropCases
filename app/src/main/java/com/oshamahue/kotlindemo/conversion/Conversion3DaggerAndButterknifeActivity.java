package com.oshamahue.kotlindemo.conversion;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.oshamahue.kotlindemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Conversion3DaggerAndButterknifeActivity extends Activity {

    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
