package com.oshamahue.kotlindemo.conversion

import android.app.Activity
import android.os.Bundle
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import com.oshamahue.kotlindemo.R

class Conversion3DaggerAndButterknifeActivity : Activity() {

    @BindView(R.id.imageView)
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }
}
