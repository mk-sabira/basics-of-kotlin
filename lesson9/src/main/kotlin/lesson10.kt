fun main()
{
//    Map

    val password = "12345"
    val username = "Sabira_32"
    val name = "Sabira"

//    key - value

    val myMap = hashMapOf<String, String>()

    myMap.put("password", "12345")
    myMap.put("username", "Sabira_32")
    myMap.put("name", "Sabira")

    myMap.remove("name")



    myMap.put("name", "Din")
    println(myMap.get("password"))
    println(myMap.entries)


//    Set

    val mySet = hashSetOf<Int>()
//    mySet.add(1)
//    mySet.add(1)
//    mySet.add(2)
//    mySet.add(3)
//
//    println(mySet)

    val list2 = arrayListOf<Int>(1,2,3,4,5,5,5,5)

    mySet.addAll(list2)
    println(mySet)
    println(list2)


}