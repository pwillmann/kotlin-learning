/**
 * Created by Patrick on 24.05.2017.
 */

fun main(args: Array<String>) {
    println("################### Simple For ###################")
    for (item in 1..10){
        println("Loop: #$item")
    }
    println("################### Simple While ###################")
    var x = 1
    while (x <= 10){
        println("Loop: #$x")
        x++
    }
    x = 1
    println("################### Simple Do-While ###################")
    do {
        println("Loop: #$x")
        x++
    }while (x < 0)
    println("################### Continue ###################")
    for (count in 1..10){
        if(count == 4){
            continue
        }
        println("count: #$count")
    }
    println("################### Break ###################")
    for (count in 1..10){
        if(count == 3){
            break
        }
        println("count: #$count")
    }
    println("################### Nested Control ###################")
    label@for (outer in 1..10){
        if(outer == 5) break
        for (inner in 1..10){
            if (inner % 2 == 0) continue
            if (outer > 2 && inner == 5) break@label
            println("outer: #$outer :: inner: #$inner")
        }
    }
}
