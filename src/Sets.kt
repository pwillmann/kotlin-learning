/**
 * Created by Patrick on 25.05.2017.
 */

fun main(args: Array<String>) {
    // immutable
    val set = setOf(1,2,3,4, 1,2,3,4)
    set.plus(4)
    set.plus(6)
    set.plus(6)
    set.minus(4)

    for ((index, value) in set.withIndex()){
        println("set[$index] = $value")
    }

    //mutable
    val mutableSet = mutableSetOf(1,2,3,4, 1,2,3,4)
    mutableSet.add(6)
    mutableSet.add(1)
    mutableSet.add(4)

    for ((index, value) in mutableSet.withIndex()){
        println("mutableSet [$index] = $value")
    }


}
