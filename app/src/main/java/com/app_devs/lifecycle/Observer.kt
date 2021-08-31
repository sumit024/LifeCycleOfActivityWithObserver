package com.app_devs.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer:LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateObserver(){
        Log.d("SUMIT","onCreateObserver")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartObserver(){
        Log.d("SUMIT","onStartObserver")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeObserver(){
        Log.d("SUMIT","onResumeObserver")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPauseObserver(){
        Log.d("SUMIT","onPauseObserver")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopObserver(){
        Log.d("SUMIT","onStopObserver")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyObserver(){
        Log.d("SUMIT","onDestroyObserver")
    }



}