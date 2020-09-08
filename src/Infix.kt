fun main() {
    //define infix function
    val p = Structure()
    p createStand  4       // p.createPyramid(4)

//define user defined infix function

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Hello ")                                    // 2

    val pair = "Ahmed" to "Ali"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "leena" onto "Taleen"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 5
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}


//infix function

class Structure() {

    infix fun createStand(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}



