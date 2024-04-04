package de.roskenet.oxygen.helloworld

import de.roskenet.oxygen.Response

class HelloWorld(val greeting: String): OxygenApi {

    override fun returnSomething(name: String): Response {
        return Response(String.format(greeting, name), true)
    }

}