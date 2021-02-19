//fun main(args: Array<String>) {
//    val a = arrayOf(1, 2, 3)
//    val b = arrayOf(4, 5, 6)
//
//    val c = a + b
//
//    println(c.sum())
//
//}



// task 2

//fun main(){
//    val numbers: Array<Int> = arrayOf(5, -3, 15, 61, 29, 10, -2 ,7)
////    var largestElement = numbers[0]
////
////    for (number in numbers){
////        if (largestElement < number)
////            largestElement = number
////    }
////    println(largestElement)
//    println(numbers.max())
//
//}

fun main(){
    val letters = Array<String>(26) { i -> ('A' + i).toString() }
    println(letters.joinToString(""))
}
