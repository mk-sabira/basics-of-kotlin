// first task
fun main (){
    print("type four-digit number: ")
    val number = readLine()!!.toInt()

    val First2Numbers = number/1000 + (number / 100) % 10
    val Last2Numbers = (number/ 10) % 10 + number % 10

    if(First2Numbers == Last2Numbers){
        println (true)
    }else{
        println(false)
    }

}

// second task
fun main(){
    print("Your age : ")
    val age = readLine()!!.toInt()
    val maxAge = 200
    val minAge = 1

    if ( minAge < age  && age < maxAge ){
        println("Your are $age years old")

    }else{
        println("Not acceptable! ")
    }
}


