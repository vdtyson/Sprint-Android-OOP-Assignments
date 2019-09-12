package com.versilistyson.week6module2_assignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.versilistyson.week6module2_assignment.R
import com.versilistyson.week6module2_assignment.model.*

class MainActivity : AppCompatActivity() {

    val vehicleList = listOf<String>(
        Scooter().travel(),
        Airplane().travel(),
        UFO().travel(),
        Scooter().travel(),
        Porsche().travel(),
        WaveRunner().travel(),
        SailBoat().travel()
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0 until vehicleList.size - 1) {
            vehicleList[i].travel()
        }

    }
}
