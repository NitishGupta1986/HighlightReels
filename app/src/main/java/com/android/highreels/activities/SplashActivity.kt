package com.android.highreels.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)
        activityScope.launch {
            delay(3000)
            var intent = Intent(this@SplashActivity, LoginActivity::class.java)
            //startActivity(intent)
            //finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
    /**var timer = Timer()
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)
    timer.schedule(3000) {
    var intent = Intent(this@SplashActivity, LoginActivity::class.java)
    startActivity(intent)
    finish()
    }
    }
    override fun onPause() {
    timer.cancel()
    super.onPause()
    }**/
}