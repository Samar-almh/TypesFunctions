// * Standard Functions
//* apply, let, run, with, also, takeIf

class User {
    var name = "A"
        set(value){
            field = value.trim().capitalize()
        }
    var career = "Dog"
    var age = 3
    var hungry = true
    var ready = false

    fun makeFull(){
        this.hungry = false
    }

    fun setReady(){
        this.ready = true
    }
}

fun main() {

    // Apply is used for configuration of an object.
    val catUser = User()
    catUser.name = "Ahmed"
    catUser.career = "Take care of the cat"
    catUser.age = 6

    // Using Apply to configure
    val human = User().apply{
        name = "Samar"
        career = "Graphic design"
        age = 22
    }

    // Let allows access to 'it' which is the instance of the variable
    val place = "County".plus(" cat Park! ").let(::enhanceString)
    println(place)

    // Run has the same as Apply, it returns boolean instead of the receiver
    val isReadyToPlay = catUser.name.run(::isPlayful)
    println("$isReadyToPlay - Ready to Play?")

    // With is a variation on the Run function
    // Usually can just use Run instead, this one requires a parameter
    val isReadyForRide = with(place){
        contains("I'm Ready!")
    }
    println("$isReadyForRide - Ready for Ride?")

    // Also is similar to let - returns receiver instead of lambda result
    catUser.also{
        println(it.hungry.toString() + " - Initial Hunger")
    }.also{
        if(it.hungry){
            it.makeFull()
        }
    }

    println(catUser.hungry.toString() + " - After Hunger Check")

    // TakeIf returns true or false based on a predicate passed
      human.takeIf{
        it.name == "Samar"
    }?.setReady()

    println(human.ready.toString() + " - Is Human Ready?!")


}

private fun isPlayful(canineName: String) = canineName == "A"
private fun enhanceString(original: String) = original.plus(listOf("Amazing!", "I'm Ready!", "Love it!").shuffled().first())