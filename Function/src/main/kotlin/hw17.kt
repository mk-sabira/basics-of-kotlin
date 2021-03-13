fun main() {
    println(money(200, 10))

}

fun money(myMoney: Int, percentForYear: Int) {
    var resultForOneYear = ((myMoney / 100) * percentForYear + myMoney).toDouble()

    var resultForTwoYears= ((resultForOneYear / 100) * percentForYear + resultForOneYear)
    var resultForThreeYears = (resultForTwoYears/ 100 ) * percentForYear + resultForTwoYears

    println(resultForThreeYears)
}




