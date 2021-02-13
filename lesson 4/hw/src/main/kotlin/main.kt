// first task
//fun main() {
//        print("ax^2 + bx +c = 0. Type the numbers : a, b and c: ")
//        val a = readLine()!!.toDouble()
//        val b = readLine()!!.toDouble()
//        val c = readLine()!!.toDouble()
//        val root1: Double
//        val root2: Double
//        val output: String
//
//        val determinant = b * b - 4.0 * a * c
//
//
//        if (determinant > 0) {
//                root1 = (-b + Math.sqrt(determinant)) / (2 * a)
//                root2 = (-b - Math.sqrt(determinant)) / (2 * a)
//
//                output = "root1 = %.2f and root2 = %.2f".format(root1, root2)
//        }
//
//        else if (determinant == 0.0) {
//                root2 = -b / (2 * a)
//                root1 = root2
//
//                output = "root1 = root2 = %.2f;".format(root1)
//        }
//
//        else {
//                val realPart = -b / (2 * a)
//                val imaginaryPart = Math.sqrt(-determinant) / (2 * a)
//
//                output = "root1 = %.2f+%.2fi and root2 = %.2f-%.2fi".format(realPart, imaginaryPart, realPart, imaginaryPart)
//        }
//
//        println(output)
//}

// second task
fun main(){
        print("The time when u hit the road: ")
        val start = readLine()!!.toDouble()

        print("The time when u arrive: ")
        val end = readLine()!!.toDouble()

        val result : Double
        result = (end - start) * 60

        println("U have arrived in $result minutes ")


}

// third task
fun main(){
        print("type two numbers: ")
        var a = readLine()!!.toInt()
        var b = readLine()!!.toInt()

        val c = a
        a = b

        println("the first number =  ${a}")
        println("the socond number = ${c}")

}