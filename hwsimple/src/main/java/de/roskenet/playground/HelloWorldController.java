package de.roskenet.playground;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String customers(Principal principal, Model model) {
        model.addAttribute("principal", principal.getName());
        return "secured";
    }
}
