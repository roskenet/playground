package de.roskenet.oxygen

import de.roskenet.oxygen.helloworld.HelloWorld
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldTest {

    val helloWorld = HelloWorld("Servus, %s!")

    @Test
    fun `HelloWorld with a name`() {
        val (greeting, isHappy) = helloWorld.returnSomething("Elvis")
        assertThat(greeting).isEqualTo("Servus, Elvis!")
        assertThat(isHappy).isTrue()
    }
}