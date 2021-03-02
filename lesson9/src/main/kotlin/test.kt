

var myMap: HashMap<String, String>? =null
fun main(){

    val names = arrayOf("KG", "USA", "UAE", "UK")
    val codes = arrayOf("+996", "+1", "+971", "+9")
    myMap = hashMapOf()

    codes.indices.forEach(){
        myMap?.put(names[it], codes[it])

    }
    println(myMap)

}

//fun main() {
//    val names = arrayListOf("Kotlin", "Java", "C++")
//
//    for (i in 0 until names.size) {
//        println(names[i])
//    }
//
//    names.forEachIndexed { index, i ->
//        println("$index $i")
//    }

//    for (i in 10 downTo 0 step 4 ){
//        println(i)
//    }
//
//    for (i in 0..10){
//        if (i == 3) break
//        println(i)
//    }

//    var i = 0
//    var j = 0
//
//
//    for (j in 0..3){
//        for (i in 0..3){
//            print(" *")
//
//        }
//        println(" *")
//    }
//
//    var k = 5
//    for (i in 0 until k){
//        for (i in 0..k-i){
//            print("  ")
//
//        }
//        for (i in 0..i){
//            print(" *")
//        }
//        println(" ")
//
//    }
//
//
//
//}
//fun main(){
//    Найти количество цифр в заданном числе n., например, число 1 содержит 1 цифру,
//    456 -- 3 цифры, 65536 -- 5 цифр. Использовать операции со строками в этой задаче
//    запрещается


//    var nums = readLine()!!.toInt()
//    var num = nums
//
//    var step : Int
//    if (nums != 0)
//        step = 1
//    else
//        step = 0
//
//    while (nums !=0){
//        step ++
//        nums /=10
//    }
//    println("Number $num contains $step number(s)")


//    Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128

//    var a = 2
//    var step: Int = 1
//    while (step <= 20){
//        print(" $a")
//        step++
//        a *= 2
//    }
//
//}





