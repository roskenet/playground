package de.roskenet.berkelium;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldController {

    @GetMapping
    @PreAuthorize("permitAll()")
    public String helloWorld() {
        return "{\"answer\": \"Hello World\"}";
    }

}
