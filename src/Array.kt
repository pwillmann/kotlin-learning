/**
 * Created by Patrick on 25.05.2017.
 */

fun main(args: Array<String>) {
    val arrayInt = Array<Int>(5){0}

    arrayInt[4] = 55

    println("########## for-each ##########")
    for (value in arrayInt){
        println(" $value")
    }
    println("########## for-index ##########")
    for (index in arrayInt.indices){
        println("$index : "+arrayInt[index])
    }
    println("########## for-each with index ##########")
    for ((index, value) in arrayInt.withIndex()){
        println("$index : $value")
    }

    val arrayStr = Array<String>(10){""}

    for (index in 0..3){
        print("arrayStr[ $index ]=")
        arrayStr[index] = readLine()!!
    }

    for (index in 0..3){
        println("arrayStr[ $index ]="+arrayStr[index])
    }


}
