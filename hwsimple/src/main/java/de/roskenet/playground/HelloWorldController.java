package de.roskenet.playground;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/hello")
    @PreAuthorize("isAuthenticated()")
    public String secured(Principal principal, Model model) {
        model.addAttribute("principal", principal.getName());
        return "secured";
    }
    
    @GetMapping(path = "/unsecured")
    public String unsecured(Model model) {
        return "unsecured";
    }
}
