package de.roskenet.playground;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @GetMapping("/")
    @PreAuthorize("isAuthenticated()")
    public String hello() {
        return "{ \"answer\": \"Hello World\"}";
    }
}
