package com.ilhomjon.myapplication

import android.annotation.SuppressLint
import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.firebase.jobdispatcher.FirebaseJobDispatcher
import com.firebase.jobdispatcher.GooglePlayDriver
import com.ilhomjon.myapplication.WorkManager.UpLoadWork
import com.ilhomjon.myapplication.databinding.ActivityMainBinding
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        //odddiy service
//        binding.btn1.setOnClickListener {
//            val intent = Intent(this, MediaService::class.java)
//            startService(intent)
//        }
//        binding.btn2.setOnClickListener {
//            val intent = Intent(this, MediaService::class.java)
//            stopService(intent)
//        }



//        //Job service
//        val jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
//        val jobInfo = JobInfo.Builder(1, ComponentName(this, MyJobService::class.java))
//        val job = jobInfo.setMinimumLatency(1)
//            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
//            .setOverrideDeadline(60000)
//            .build()
//
//        binding.btn1.setOnClickListener {
//            jobScheduler.schedule(job)
//        }
//        binding.btn2.setOnClickListener {
//            jobScheduler.cancel(1)
//        }



//        //jobFirebase
//        // link: https://github.com/googlearchive/firebase-jobdispatcher-android
//        val firebaseJobDispatcher = FirebaseJobDispatcher(GooglePlayDriver(this))
//        val job = firebaseJobDispatcher.newJobBuilder()
//            .setService(MyFirebaseService::class.java)
//            .setTag("IxtiyoriyTag")
//            .build()
//        //faqat real qurilmada telefonda ishlaydi emulatorda ishlamadi
//        binding.btn1.setOnClickListener {
//            firebaseJobDispatcher.mustSchedule(job)
//        }
//        binding.btn2.setOnClickListener {
//            firebaseJobDispatcher.cancel("IxtiyoriyTag")
//        }


        //workManager
        //link shajarasi: https://developer.android.com/topic/libraries/architecture/workmanager
        //link2: https://developer.android.com/topic/libraries/architecture/workmanager/basics
        binding.btn1.setOnClickListener {
//            //1 marta ishlaydi
//            val workRequest = OneTimeWorkRequestBuilder<UpLoadWork>().build()
//            WorkManager.getInstance(this).enqueue(workRequest)

            //minutiga 1 marta deb shart beryapmiz. Servicelar tizim optimatsiyasini hisobga olib minimal 15 min da ishlaydi
            val workRequest2 = PeriodicWorkRequestBuilder<UpLoadWork>(1, TimeUnit.MINUTES).build()
            WorkManager.getInstance(this).enqueue(workRequest2)
        }
        binding.btn2.setOnClickListener {

        }
    }
}