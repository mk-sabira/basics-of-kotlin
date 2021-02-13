//first task
//fun main(){
//        print("The time when u hit the road: ")
//        val start = readLine()!!.toDouble()
//
//        print("The time when u arrive: ")
//        val end = readLine()!!.toDouble()
//
//        val result : Double
//        result = (end - start) * 60
//
//        println("U have arrived in $result minutes ")
//
//
//}

//second task

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
