//First version

//fun main() {
//    println(money(200, 10))
//
//}
//
//fun money(myMoney: Int, percentForYear: Int) {
//    var resultForOneYear = ((myMoney / 100) * percentForYear + myMoney).toDouble()
//
//    var resultForTwoYears= ((resultForOneYear / 100) * percentForYear + resultForOneYear)
//    var resultForThreeYears = (resultForTwoYears/ 100 ) * percentForYear + resultForTwoYears
//
//    println(resultForThreeYears)
//}

//Second version
fun main() {
    val money = readLine()!!.toDouble()
    val percentForYear = readLine()!!.toDouble()
    val year = readLine()!!.toDouble()
    val sum = inBank(moneyOfClinte = money, percent = percentForYear, duration = year )
    println(sum)
}



fun inBank(moneyOfClinte: Double, percent: Double, duration: Double): Double {

    var sum  = moneyOfClinte * Math.pow((1+ percent/100).toDouble(), duration.toDouble())
    return sum
}

