package com.ilhomjon.myapplication

import android.util.Log
import android.widget.Toast
import com.firebase.jobdispatcher.JobParameters
import com.firebase.jobdispatcher.JobService


class MyFirebaseService : JobService() {
    private val TAG = "MyFirebaseService"
    override fun onStartJob(job: JobParameters): Boolean {
        Log.d(TAG, "onStartJob: ")
        Toast.makeText(this, "Job firebase service working", Toast.LENGTH_SHORT).show()
        return false
    }

    override fun onStopJob(job: JobParameters): Boolean {
        Log.d(TAG, "onStopJob: ")
        Toast.makeText(this, "Job firebase service stopping", Toast.LENGTH_SHORT).show()
        return false
    }

}