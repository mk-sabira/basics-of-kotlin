fun main() {
//    val child1 = EarlyYearsSetting("Ella", "Khamad", 3, "PreSchoolers" )
//    val child2 = EarlyYearsSetting( "Samuel", "Xeynah", 2, "Toddlers" )
//    val child3 = child1.copy()
//
//
//    println("child1's hash code is "+ child1.hashCode())
//    println("child2's hash code is "+ child2.hashCode())
//    println("child3's hash code is "+ child3.hashCode())
//
//    println(child1.toString())
//    println(child2.toString())
//
//    println(child1 == child2)
//
//
//    println(child3)
//    println(child1 == child3)

    val book1 = Books("Brain Rules", "Biddulph", 2005-2006)
    val book2 = Books("Little Prince", "Antoine De Saint-Exupery" , 1956)
    val book3 = Books("Mansfield Park", "Jane Austen", 1796-1797)
    val book4 = Books("Red Dog", "Louis De Bernieres", 2001)
    val book5 = book1.copy()

    println("Book1's hash code is - " + book1.hashCode())
    println("Book2's hash code is - " + book2.hashCode())
    println("Book3's hash code is - " + book3.hashCode())
    println("Book4's hash code is - " + book4.hashCode())
    println("Book5's hash code is - " + book5.hashCode())

    println(book1 == book5)
    println(book2 == book3)
}


data class EarlyYearsSetting(
    val name: String,
    val surname: String,
    val age: Int,
    val group: Any
){

}

data class Books(
    val name: String,
    val Author: String,
    val pubYears: Int,

){}

