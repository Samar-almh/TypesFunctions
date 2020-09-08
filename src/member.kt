//the local function

fun main() {
    println("hello: ")
    higherfunc("A Computer Science is the strongest department",::println)


    fun buildMessage(name: String?): String {
        return "Hello $name"
    }

    println("Samar ")
    val name = readLine()

    val message = buildMessage(name)
    println(message)

    //lambda function
    val sum = {num1: Int, num2: Int -> num1 + num2}
    println("10+5: ${sum(10,5)}")
}

//inline function
inline fun higherfunc( str : String, mycall :(String)-> Unit){
    //inovkes the print() by passing the string str
    mycall(str)
}

