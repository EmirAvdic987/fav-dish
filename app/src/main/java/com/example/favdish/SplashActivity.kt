package com.example.favdish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.favdish.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_splash)

        val splashActivity: ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashActivity.root)
    }
}