package de.roskenet.demokotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController
    @GetMapping("/hello")
    fun helloWorld() =
        "{\" value\": \"Hello World!\"}"