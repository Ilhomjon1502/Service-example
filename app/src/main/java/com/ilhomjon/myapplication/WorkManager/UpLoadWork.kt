package com.ilhomjon.myapplication.WorkManager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UpLoadWork(context: Context, workerParameters: WorkerParameters)
    : Worker(context, workerParameters){
    private val TAG = "UpLoadWork"
    override fun doWork(): Result {

        uploadImages()

        return Result.success()
    }

    private fun uploadImages() {
        Log.d(TAG, "uploadImages: ")
    }

}