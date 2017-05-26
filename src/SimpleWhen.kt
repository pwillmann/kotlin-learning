/**
 * Created by Patrick on 24.05.2017.
 */

fun main(args: Array<String>) {
    val x = 10

    when(x){
        1 -> print(11)
        2 -> print(21)
        3 -> print(31)
        else -> print(x)
    }

    println()
    when(x){
        1,2 -> {
            print(11)
        }
        in 3..10 -> {
            print(21)
        }
        !in 10..100 -> {
            print(31)
        }
        else -> {
            print(x)
        }
    }

    if(x in 1..11){
        println("niceeee")
    }
}
