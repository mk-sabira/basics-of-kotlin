import java.util.*

//var value: String? = null
//lateinit var latevalue: String
//
//fun main(){
//
////    value = "hello"
//
////Safe call operator ( ?.)
////    println(value?.length)
//
////Safe call with let ( ?.let)
//    value?.let {
////        println(it.length)
//    }
//
//// Elvis operator ( ?:)
//
//    val length = if(value != null) {
//        value!!.length }
//    else{
//        -1
//    }
//
//    val length2 = value?.length?: -1
////    println(length)
//
//
////Non null assertion operation (!!)
////    println(value!!.length)
//
////    'lateinit' keyword
//
//    latevalue = "Java"
//    println(latevalue.length)
//}


fun main(){

    print("Type first number : ")
    var num1 = readLine()!!.toInt()

    print("Type second number: ")
    var num2 = readLine()!!.toInt()


    val summ = num1 + num2
    println( "a + b: $summ")


    print("Type first number : ")
    var num3 = readLine()!!.toInt()

    print("Type second number: ")
    var num4 = readLine()!!.toInt()

    val result = num3 - num4
    println( "a - b: $result")


}
