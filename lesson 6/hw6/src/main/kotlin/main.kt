//first task


import kotlin.math.*

fun main(args : Array<String>){
    println("Type a parameter: ")
    val x = readLine()!!.toDouble()
    val y = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()

    val h = sqrt(x* x + y*y)
    when {
        h > r -> println("Inside the circle")
        h < r -> println("Outside the circle")
    }


}
