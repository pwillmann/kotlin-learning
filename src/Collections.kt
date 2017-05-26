/**
 * Created by Patrick on 25.05.2017.
 */

fun main(args: Array<String>) {
    var map = hashMapOf(1 to "First", 2 to "Second")

    map.put(3, "Third")
    println(map[2]+ map[3])

    val array = arrayOf(1,2,3,4,5, 8, 9)
    for ((index,item) in array.withIndex()){
        println("array[$index] = $item")
    }

    // immutable
    val list = listOf(1, 2, 3, 4, 5, 8, 10)
    for ((index,item) in list.withIndex()){
        println("list[$index] = $item")
    }
    // list[0] = 1 -> not possible
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 8, 10)
    mutableList[0] = 1

}
