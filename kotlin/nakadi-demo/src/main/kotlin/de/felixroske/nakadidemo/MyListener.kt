package de.felixroske.nakadidemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import org.zalando.fahrschein.NakadiClient

data class Order(val someString: String,
    val someInt: Int)

@Component
class MyListener {

    @Autowired
    @Qualifier("helloworld")
    lateinit var nakadiClient: NakadiClient

    fun doSomething() {
        println("What happens here?")
    }

}