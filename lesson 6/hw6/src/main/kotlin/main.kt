import java.util.Scanner

fun main(args : Array<String>) {
    val reader = Scanner(System.`in`)
    print("Type a serial number of month: ")


    val number:Int = reader.nextInt()
    
    if(!(1 <= number && number <= 12)){
        println("We have only 12 months in a year =) ")
    }

    when(number ) {
        1, 3, 5, 7, 8, 10, 12 -> println("The month $number has 31 days")
        2 -> println("The month $number has 28 days")
        4, 6, 9, 11 -> println("The month $number has 30 days")

    }

}
