package de.roskenet.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleClientController {

    @GetMapping("/")
    public String callSimpleService() {
        
        String answer = "NOTHING YET";
        
        return "Simple service answered: " + answer;
    }
}
