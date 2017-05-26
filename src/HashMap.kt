/**
 * Created by Patrick on 25.05.2017.
 */

fun main(args: Array<String>) {
    val map = HashMap<Int, String>()

    map.put(0, "First")
    map.put(1, "Second")
    map.put(2, "Third")

    println("########## Key, Value Iteration ##########")
    for ((key, value) in map){
        println("map.get($key) = $value")
    }


    println("########## Key Iteration ##########")
    for (key in map.keys){
        println("map.get($key) = "+map.get(key))
    }

    println("########## Value Iteration ##########")
    for (value in map.values){
        println("$value ")
    }
}
