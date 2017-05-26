/**
 * Created by Patrick on 26.05.2017.
 */

/****** POJOs ******/
data class Customer(val id: Int, val name: String, val email: String)


fun main(args: Array<String>) {
    val firstCust = Customer(1, "Test1", "test@test.test")
    val secondCust = Customer(2, "Test2", "test@test.test")
    val fourteenthCust = Customer(14, "Test14", "test@test.test")
    val thousandthCust = Customer(1000, "Test1000", "test@test.test")

    val customers = arrayListOf(firstCust, secondCust, fourteenthCust, thousandthCust)
    println("Customers = $customers")
    val top5Cust = customers.filter { it.id < 5 }
    println("Top 5 Customers = $top5Cust")


}
