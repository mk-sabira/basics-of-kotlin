fun main() {
    val child1 = KinderGarden("Ella", "Omani", 3)
    val child11 = KinderGarden("Ella", "Omani", 3)
//    val child2 = KinderGarden("Yassen", "Khamad", 4)

    println("Hash code of child1 is - ${child1.hashCode()}")
    println("Hash code of child11 is - ${child11.hashCode()}")
//    println("Hash code of child2 is - ${child2.hashCode()}")

    println(child1.toString())
    println(child11.toString())
//    println(child2.toString())

    println(child1 == child11)


    val child3 = child1.copy(surName = "Khalid")
    println("child3 - $child3")
    println(child1 == child3)
}



//if we work with CLASS
//class KinderGarden(
//    val name: String,
//    val surName: String,
//    val age: Int){
//
//    override fun toString(): String {
//        return "$name, $surName, $age"
//    }
//
//    override fun equals(other: Any?): Boolean {
//       return this.name == (other as KinderGarden).name
//        this.surName == (other as KinderGarden).surName
//        this.age == (other as KinderGarden).age
//
//    }
//
//}


//working with DATA CLASS
data class KinderGarden(
    val name: String,
    val surName: String,
    val age: Int){

}