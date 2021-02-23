import kotlin.math.sqrt

//fun main(args: Array<String>) {
//    starTriangle()
//
//}
//
//fun starTriangle(){
//    var n = 5
//
//    for(i in 0..n){
//        for (j in 0.. n- i){
//            print(" ")
//        }
//        for (k in 0 .. i){
//            print("*")
//        }
//        println(" ")
//    }
//}
////var n=4
////
////for (i in 0 .. n){
////    for (j in 0.. n-i){
////        print(" ")
////    }
////
////    for (k in 0.. i){
////        print("*")
////    }
////    println(" ")
////}



//Найти количество цифр в заданном числе n.,
// например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
// Использовать операции со строками в этой задаче запрещается.


//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
fun main(){
    var number= sqrt(2.0)

    while (number <= 20){
        println(number)
        ++number
    }
}