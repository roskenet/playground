package de.roskenet.playground;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    private static Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping(path = "/hello")
    @PreAuthorize("isAuthenticated()")
    public String secured(Principal principal, Model model) {
        LOG.info("Authenticated user is here!");
        model.addAttribute("principal", principal.getName());
        return "secured";
    }
    
    @GetMapping(path = "/unsecured")
    public String unsecured(Model model) {
        LOG.info("Unknown user is here!");
        return "unsecured";
    }
}
