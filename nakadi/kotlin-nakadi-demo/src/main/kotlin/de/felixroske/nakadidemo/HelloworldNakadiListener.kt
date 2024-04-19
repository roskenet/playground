package de.felixroske.nakadidemo

import org.springframework.stereotype.Component
import org.zalando.spring.boot.fahrschein.nakadi.NakadiListener

class Helloworld {
    var name: String = ""
    var age: Int = 0
}

@Component
class HelloworldNakadiListener: NakadiListener<Helloworld> {

    override fun accept(events: MutableList<Helloworld>) {
        for (event in events) {
            println("${event.name} - ${event.age}")
        }
    }

    override fun getEventType(): Class<Helloworld> {
        return Helloworld::class.java
    }
}