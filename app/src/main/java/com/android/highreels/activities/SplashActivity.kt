package com.android.highreels.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.android.highreels.R
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    private var progressStatus = 0
    private val handler: Handler = Handler()

    //    private val activityScope = CoroutineScope(Dispatchers.Main)
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        supportActionBar?.hide()
//        setContentView(R.layout.activity_splash)
//        activityScope.launch {
//            delay(3000)
//            var intent = Intent(this@SplashActivity, LoginSignUpActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//    }
    //    override fun onPause() {
//        activityScope.cancel()
//        super.onPause()
//    }
    var timer = Timer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)
        timer.schedule(3000) {
            var intent = Intent(this@SplashActivity, LoginSignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        Thread {
            while (progressStatus < 100) {
                progressStatus += 1
                // Update the progress bar and display the
                //current value in the text view
                handler.post {
                    progressBar.progress = progressStatus
                    //textView.setText(progressStatus.toString() + "/" + progressBar.getMax())
                }
                try {
                    // Sleep for 200 milliseconds.
                    Thread.sleep(30)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
    }

    override fun onPause() {
        timer.cancel()
        handler.removeCallbacksAndMessages(null)
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        timer.cancel()
    }
}