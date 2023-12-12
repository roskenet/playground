fun main(args: Array<String>) {
    println("Hello World!")

    val aString = "Weihnachtsgans"
    doSomething(aString)
}

fun doSomething(param: String) =
    println("The word is ${param}")