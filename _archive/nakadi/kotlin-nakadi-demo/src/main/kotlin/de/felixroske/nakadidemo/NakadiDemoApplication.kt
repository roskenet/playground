package de.felixroske.nakadidemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NakadiDemoApplication: CommandLineRunner {

    @Autowired
    lateinit var myListener: HelloworldNakadiListener

    override fun run(vararg args: String?) {
        println("Hello World")
        var userInput = readln();
    }
}

fun main(args: Array<String>) {
    runApplication<NakadiDemoApplication>(*args)
}
