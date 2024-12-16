package de.felixroske

fun main() {
    executeSomething(::rangePlayground)
}

fun rangePlayground() {
    for(i in 1..100 step 2) {
        println(i)
    }
}

typealias MyFunc = () -> Unit

fun executeSomething(myFunc: MyFunc) {
    myFunc()
}
