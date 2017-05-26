package oop

/**
 * Created by Patrick on 25.05.2017.
 */

class Car(Brand: String, Model: Int, Price: Double, Mileage: Int, Owner: String) {
    val Owner: String
    val Price: Double
    val Mileage: Int
    val Model: Int

    init {
        println("Brand:     $Brand")
        println("Model:     $Model")
        println("Price:     $Price")
        println("Mileage:   $Mileage")
        println("Owner:     $Owner")
        this.Owner = Owner
        this.Price = Price
        this.Mileage = Mileage
        this.Model = Model
    }

    fun GetCurrentPrice(): Double {
        return this.Price - (this.Mileage * 10)
    }
}

class SimpleCar() {
    constructor(Brand: String) : this() {
        println("test")
    }
}

fun main(args: Array<String>) {
    val myCar = Car("Mercedes", 2017, 10000.0, 10, "Patrick")
    val valsCar = Car("Mercedes", 2015, 10000.0, 100, "Val")

    val simpleCar = SimpleCar()


}
