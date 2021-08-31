package com.app_devs.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("SUMIT","onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SUMIT","onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SUMIT","onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SUMIT","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SUMIT","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SUMIT","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SUMIT","onDestroy")
    }
}