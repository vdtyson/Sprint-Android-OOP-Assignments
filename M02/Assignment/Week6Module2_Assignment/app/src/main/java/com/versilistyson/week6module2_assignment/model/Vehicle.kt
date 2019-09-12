package com.versilistyson.week6module2_assignment.model

import android.util.Log
import com.versilistyson.week6module2_assignment.`interface`.AirTravel
import com.versilistyson.week6module2_assignment.`interface`.GroundTravel
import com.versilistyson.week6module2_assignment.`interface`.WaterTravel

abstract class Vehicle(val id: String, val weight: Int, var favorite: Boolean) {

    abstract fun travel() : String
}

 class Airplane(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {
     val name = "airplane"
     override fun travel() : String {
        return "An airplane flies with ${fly()}"
    }

    override fun fly() : String {
        val planeFliesWith = "wings"
        return planeFliesWith
    }

}
 class UFO(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), AirTravel {
     val name = "UFO"
    override fun fly() : String {
        return "A $name flies with ${fly()}"
    }

    override fun travel(): String {
        return fly()
    }

}
 class Scooter(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), GroundTravel {
    override fun drive(): String {
        return "Can we consider this a vehicle?"
    }

    override fun travel(): String {
        return drive()
    }

}
 class Porsche(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), GroundTravel {
    override fun drive() : String {
       return  "A porsche drives on four wheels"
    }

    override fun travel() : String {
        return drive()
    }

}
 class WaveRunner(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {
    override fun sail(): String {
        return "A wave runner has an impeller"
    }

    override fun travel(): String {
        return sail()
    }
}
 class SailBoat(id: String, weight: Int, favorite: Boolean) : Vehicle(id, weight, favorite), WaterTravel {
    override fun sail(): String {
       return "A sail uses sails. Who would've thought"
    }

    override fun travel(): String {
        return sail()
    }

}
