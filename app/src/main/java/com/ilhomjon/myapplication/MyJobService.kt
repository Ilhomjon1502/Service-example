package com.ilhomjon.myapplication

import android.app.Service
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class MyJobService : JobService() {
    private val TAG = "MyJobService"
    override fun onStartJob(p0: JobParameters?): Boolean {
        Log.d(TAG, "onStartJob: ")
        Toast.makeText(this, "Job service working", Toast.LENGTH_SHORT).show()
        return true
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
        Log.d(TAG, "onStopJob: ")
        Toast.makeText(this, "Job service stopping", Toast.LENGTH_SHORT).show()
        return true
    }

}