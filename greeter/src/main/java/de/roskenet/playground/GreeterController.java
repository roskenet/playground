package de.roskenet.playground;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GreeterController {

    public static class Greeting {
        private String name;
        
        public Greeting(String name) {
           this.name = name; 
        }
        
        public String getName() {
            return name;
        }
    }
    
    @GetMapping("/greet/{name}")
    public Greeting greet(@PathVariable("name") String name) {
       return new Greeting(name); 
    }
}
