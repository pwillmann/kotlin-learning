/**
 * Created by Patrick on 25.05.2017.
 */

fun main(args: Array<String>) {
    val arrayList = ArrayList<String>()

    println("########## Empty ##########")
    for ((index, value) in arrayList.withIndex()){
        println("arrayList.get($index) = $value")
    }

    println("########## Added Item(s) ##########")
    arrayList.add("First")
    arrayList.add("Second")
    arrayList.add("Third")
    for ((index, value) in arrayList.withIndex()){
        println("arrayList.get($index) = $value")
    }

    println("########## Set ##########")
    arrayList[0] =  "FirstSet"
    for ((index, value) in arrayList.withIndex()){
        println("arrayList.get($index) = $value")
    }



}
