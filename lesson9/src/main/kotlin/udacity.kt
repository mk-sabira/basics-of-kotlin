import java.util.*

//fun main() {
//    var a = readLine()!!.toInt()
//    if (a > 12){
//        println("Good morning Kotlin") }
//    else {
//        println("Good night Kotlin")
//    }}

//fun main(){
//    feedTheFish()
//}
//fun feedTheFish(){
//    val day = randomDay()
//    val food = "pellet"
//    println("Today is $day and the fish eats $food")
//}
//fun randomDay():String{
//    val week = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(7)]
//}
//fun main(){
//    println("\nYour fortune is: ${getFortuneCookie()}")
//}
//fun getFortuneCookie():String{
//    val fortunes = listOf<String>("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well." , "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
//    print("Enter your Birthday: ")
//    val birthday = readLine()?.toIntOrNull() ?: 1
//    return fortunes[birthday.rem(fortunes.size)]
//}
//fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortuneCookie()
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }
//}
fun main(args: Array<String>) {
    println(whatShouldIDoToday("Sunny"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}