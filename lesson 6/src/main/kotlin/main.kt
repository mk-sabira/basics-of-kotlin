fun main(args: Array<String>) {
    val score = 40

    if (score == 20){
        println("score is 20")
    }

    when(score) {
        in 90..100 -> println("5")
        in 70..89 -> println("4")
        in 50..69 -> println("3")
        in 30..49 -> println("2")
        in 8..29 -> println("1")
        else -> {
            println("score is invalid")
        }

    }

    when{
        3 > 4 -> println(" 3 > 4")
        "string".length == 4 -> println("length is 4")
        2 > 4 -> println(" 2 > 4")
        else -> {
            println("else called")
        }

    }

    val a = 5
    val b = 3

    val maxValue = when ( a > b) {
        true -> a
        false -> b
    }


    println("maxValue : $maxValue")
}