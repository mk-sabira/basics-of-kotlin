
//task 1
//fun main(args: Array<String>) {
//    val star = "* * * * *"
//    var i = 1
//
//    while ( i <= 4){
//        println(star)
//        i++
//    }
//
//
//
//}


//task 2
fun main(){
    leftTriangle()
}

fun leftTriangle(){

    var n=4

    for (i in 0 .. n){
        for (j in 0.. n-i){
            print("  ")
        }

        for (k in 0.. i){
            print(" *")
        }
        println("  ")
    }
}



