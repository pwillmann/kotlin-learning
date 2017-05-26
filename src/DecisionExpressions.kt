/**
 * Created by Patrick on 24.05.2017.
 */

fun main(args: Array<String>) {
    // if (ternary)
    val n1 = 10
    val n2 = 20
    val max = if(n1>n2) n1 else n2
    print("max: $max")

    // when

    val age = 30

    val isYoung: Boolean = when(age){
        30 -> true
        else -> false
    }


}
