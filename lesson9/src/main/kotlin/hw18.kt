//first
//fun main() {
//    val pet = Cat("Gushi", 3)
//    println(pet.name)
//    println(pet.age)
//
//    val restaurant = Food("Shakshuka", "egg, tomatoes and onions", false)
//    println(restaurant.name)
//    println(restaurant.ingredients)
//    println(restaurant.gluten)
//}
//
//class Cat(val name: String, val age: Int)
//
//class Food(val name: String, val ingredients: String, val gluten: Boolean)
//
//class Paper(val type: String, val age: Int)
//
//class Boiler(val name: String, val madeIn: String, val warranty: Int )
//
//class Battery(val name: String, val madeIn: String, val warranty: Int)
//
//class Liquid(val type: String, val boilingPoints: Int )
//
//class Cup(val type: String, val specialFunction: String )
//
//class Box(val type: String, val specialFunction: String )
//
//class Student(val name: String, val university:String, val age: Int)
//
//class Employee(val name: String, val age: Int, val experience: Int)

//Second

fun main() {
    val cat1 = Cat("Gushi", 3)

    println(cat1.name)
    println(cat1.age)
    println(cat1.satietyLevel())
    println(cat1.waterLevel())

//    println(cat1.satietyLevel())
}

class Cat(val name: String, val age: Int ){

    private val i = 0
    fun satietyLevel(){
        when (i in 0..10) {
            in 0..5 -> println("Hungry")
            in 5..10 -> println("Full")
        }

    }

    fun waterLevel(){
        when(i in 0..10){
            in 0..5 -> println("thirsty")
            in 6..10 -> println("not thirsty")
        }
    }
}