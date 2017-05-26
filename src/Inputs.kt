/**
 * Created by Patrick on 22.05.2017.
 */
fun main(args: Array<String>) {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val age:Int = readLine()!!.toInt()
    print("Enter your department: ")
    val dep:String?

    dep = readLine()

    println("")
    println("")
    println("Name: ${name}")
    println("Age: ${age}")
    println("Department: ${dep}")





}