package de.roskenet.oxygen.helloworld

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloWorldConfig {

    @Value("\${hello.greeting}")
    lateinit var greeting: String

    @Bean
    fun oxygenApi(): OxygenApi {
        return HelloWorld(greeting)
    }
}