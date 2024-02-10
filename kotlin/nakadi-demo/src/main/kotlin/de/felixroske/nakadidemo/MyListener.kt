package de.felixroske.nakadidemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import org.zalando.fahrschein.NakadiClient
import org.zalando.spring.boot.fahrschein.nakadi.NakadiListener
import org.zalando.spring.boot.fahrschein.nakadi.config.NakadiConsumer
import org.zalando.spring.boot.fahrschein.nakadi.stereotype.NakadiEventListener

data class Order(val someString: String,
    val someInt: Int)

@Component
class MyListener {

    @Autowired
    lateinit var applicationContext: ApplicationContext

    @Autowired
//    @Qualifier("orders")
//    @NakadiEventListener("orders")
    lateinit var listener: NakadiListener<Order>

    fun doSomething() {
        println("What happens here?")
    }

}