package com.versilistyson.week6module2_assignment.model

import android.util.Log
import com.versilistyson.week6module2_assignment.`interface`.AirTravel
import com.versilistyson.week6module2_assignment.`interface`.GroundTravel
import com.versilistyson.week6module2_assignment.`interface`.WaterTravel

abstract class Vehicle {

    abstract fun travel()
}

 class Airplane: Vehicle(), AirTravel {
    override fun travel() {
        fly()
    }

    override fun fly() {
        Log.i("Airplane", "Flies with Wings")
    }

}
 class UFO: Vehicle(), AirTravel {
    override fun fly() {
        Log.i("UFO", "The UFO Flies with ???")
    }

    override fun travel() {
        fly()
    }

}
 class Scooter: Vehicle(), GroundTravel {
    override fun drive() {
        Log.i("Scooter", "Can we consider this a vehicle?")
    }

    override fun travel() {
        drive()
    }

}
 class Porsche: Vehicle(), GroundTravel {
    override fun drive() {
        Log.i("Porsche", "Drives on 4 wheels")
    }

    override fun travel() {
        drive()
    }

}
 class WaveRunner: Vehicle(), WaterTravel {
    override fun sail() {
        Log.i("WaveRunner", "Rides through use of impeller and driveshaft")
    }

    override fun travel() {
        sail()
    }
}
 class SailBoat: Vehicle(), WaterTravel {
    override fun sail() {
        Log.i("SailBoat", "Uses sails. Who would've though?")
    }

    override fun travel() {
        sail()
    }

}
