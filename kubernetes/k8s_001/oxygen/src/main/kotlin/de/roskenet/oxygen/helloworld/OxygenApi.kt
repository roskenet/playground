package de.roskenet.oxygen.helloworld

import de.roskenet.oxygen.Response
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
interface OxygenApi {
    @GetMapping("/api/name/{name}")
    fun returnSomething(@PathVariable name: String): Response
}