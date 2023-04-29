package de.roskenet.demokotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

private const val EUROPE_BERLIN = "Europe/Berlin"

@RestController
class HelloWorldController {

    data class ReturnValue(val value: String, val now: ZonedDateTime)

    @GetMapping("/hello")
    fun helloWorld(): ReturnValue {
       return ReturnValue("Hello World", playWithJavaClasses())
    }

    fun playWithJavaClasses(): ZonedDateTime {
        return ZonedDateTime.now(ZoneId.of(EUROPE_BERLIN))
    }
}