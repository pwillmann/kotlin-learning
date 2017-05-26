/**
 * Created by Patrick on 24.05.2017.
 */

fun main(args: Array<String>) {

    val n1: Int = 10
    val n2: Int?
    val n2Str: String  = "12"

    n2 = n2Str.toInt()

    println(n2Str + n2Str)
    println(n2Str.toByteOrNull())
}