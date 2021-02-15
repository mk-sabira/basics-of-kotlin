fun main() {
    val a = 7


    val message =
        if (a % 2 == 0)
            "a is even"
        else if (a % 2 != 0 && a % 5 == 0)
            "a is divisible by 5"
        else
            "a is not even and not divisible by 5"

    println(message)


}


