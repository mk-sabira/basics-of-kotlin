
fun main(){
    val itemCosts = mapOf<String, Double>("Bread" to 20.0, "Milk" to 25.0)
    val shoppingList = listOf<String>("Bread", "Milk")
    var totalCost = 0.0

    for (item in shoppingList) {
        val costs = itemCosts [item]
        if (costs != null){
            totalCost += costs
        }

    }
    println("Total cost: $totalCost")
}