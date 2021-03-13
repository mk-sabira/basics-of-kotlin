fun main() {
//    myFun("Sabira", 3)
    println(myFun2("3", 5))

    println(printInt(arrayOf(1,2,3)))

    println(getMax(34, 3))
    println(getMax(34.0, 35.0))
    println(getMax(2,3,4))
}

//fun 4

fun printInt(ints: Array<Int>){
    for (i in ints) println(i)
}



//fun 3
fun myFun2(name: String = "Python", reps: Int = 3){
    var counter = reps

    while (counter> 0) {
        println("Hello $name!")
        counter--
    }
}
// fun 1
fun getMax(num1: Int, num2: Int):Int = if (num1 > num2)  num1 else  num2


//Overloading fun 1
fun getMax(num1: Int, num2: Int, num3: Int):Int {
    return when {
        num1 > num2 && num1 > num3 -> num1
        num2 > num1 && num2 > num3 -> num2
        else -> num3
    }

}

//Overloading2 fun 1
fun getMax(num1: Double, num2: Double): Double {
    return if (num1 > num2)  num1 else  num2
}


// fun 2
fun myFun(name: String, reps: Int){
    var counter = reps
    while (counter> 0) {
        println("Hello $name!")
        counter--
    }
}