package de.felixroske.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class NonesenseBackendApplication

data class Answer(val theAnswer: String, val theAnswerAsNumber: Int);

@RestController
class AnswerController {
	@CrossOrigin(origins = ["*"])
	@GetMapping("/answer")
	fun getAnswer(): Answer {
		return Answer("Love and Rock'n'Roll", 42);
	}
}

fun main(args: Array<String>) {
	runApplication<NonesenseBackendApplication>(*args)
}
