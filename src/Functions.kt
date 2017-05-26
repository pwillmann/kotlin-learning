/**
 * Created by Patrick on 25.05.2017.
 */

/******************* Simple Functions *******************/
fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}


fun sum(n1: Int, n2: Int, n3: Int): Int {
    return sum(n1, n2) + n3
}

fun sum(n1: Int, n2: Int, n3: Int, n4: Int): Int {
    return sum(n1, n2, n3) + n4
}

/****************** Recursion *******************/
fun sumRecursive(vararg n: Int): Int {
    if (n.isEmpty()) return 0
    if (n.size == 1) return n[0]

    val subarray = IntArray(n.size - 1)
    for ((index, item) in n.withIndex()) {
        if (index > subarray.size - 1) break
        subarray[index] = item
    }

    return n.get(0) + sumRecursive(*subarray)
}

fun faculty(number: Int): Int {
    if (number <= 0) return 1

    return number * faculty(number - 1)
}

/****************** No return Functions *******************/
fun display(n: Int): Unit {
    println("n:$n")
}

/****************** Infix Functions *******************/
infix fun String.times(x: Int): String {
    if (x <= 1) return this

    var string: String = this
    for (i in 1..x - 1) string += this

    return string
}

/****************** Default Arguments *******************/
fun timesWithDefault(reqString: String, optTimes: Int = 1): String {
    if (optTimes <= 1) return reqString

    var string: String = reqString
    for (i in 1..optTimes - 1) string += reqString

    return string
}

/****************** Single-Expression functions *******************/

fun double(x: Int): Int = x * 2

fun main(args: Array<String>) {
    val r = sum(10, 20)
    display(r)
    println(sumRecursive(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    val facultyBase = -1
    println("FacultyRecursive of [$facultyBase] = " + faculty(facultyBase))

    println("(abc)" times 6)

    println(timesWithDefault("(abc)"))
    println(timesWithDefault("(abc)", 6))

    println(double(2))
}
