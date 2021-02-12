//fun main(args: Array<String>) {
//    val a = 4
//    val b = 5
//
//    val bool = a !=b
//
//    // > , < , >= , <= , ==, != , && , ||
//
////    if (a < b){
////        println("if block called")
////    }
//
////    if (a == b || a >= b){
////        println("if block called")
////    }
//
//    if (false){
//        println("if block called")
//    } else if (true){
//        println("else block called ")
//    } else{
//        println("else block called ")
//    }
//}

fun main(){
    val score = -5

    if (score >= 90 && score<= 100){
        println("5")
    }else if (score >= 70 && score < 90){
        println("4")
    }else if (score >= 50 && score < 70){
        println("3")
    }else if (score >= 30 && score < 50){
        println("2")
    } else if (score >= 0 && score < 30){
        println("1")
    } else {
        println("invalid score ")
    }

    val a = 5
    val b = 3

    val maxValue = if ( a > b)
        a
    else
        b


    println("maxValue : $maxValue")

}