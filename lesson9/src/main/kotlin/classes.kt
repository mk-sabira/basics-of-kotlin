fun main() {
    val children = Child("Ella", "Amori", 3)

    println(children.name)
    println(children.surName)
    println(children.age)

    children.intrYourSelf()
    val nursery = Nursery("Play House", "Khalidiya", 3, 12)
    println(nursery.intrYourSelf())

}


//First simple tipe
//class Child( name: String,  surName: String,  age: Int){
//    var name: String = "Shah"
//    var surName: String = "Din"
//    var age: Int = 2
//
//    init {
//        this.name = name
//        this.surName = surName
//        this.age = age
//    }
//}

//Second tipe with properties   . This is the main construtor: (val name: String, val surName: String, val age: Int)
open class Child(val name: String, val surName: String, val age: Int){
    open fun intrYourSelf(){
        println("My name is $name and I like to play")
    }
}

//nasledovanie

class Nursery(name: String,  surName: String,  age: Int, val experience: Int): Child(name, surName, age  ){
    override fun intrYourSelf() {
        println("We are well known nursery in the UAE and your child will be happy\n to spend their time in the $name $surName. We have $experience years of experience working with children")
    }
}