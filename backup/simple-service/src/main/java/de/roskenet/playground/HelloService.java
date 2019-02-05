package de.roskenet.playground;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @GetMapping("/api/contracts")
    @PreAuthorize("#oauth2.hasScope('profile')")
    public String hello(OAuth2Authentication auth) {
        
       StringBuilder sb = new StringBuilder();
       String answer = sb.append("\"")
          .append("You are: ")
          .append(auth.getPrincipal().toString())
          .append(" Granted scopes: ")
          .append(auth.getOAuth2Request().getScope())
          .append("\"")
          .toString();
        
        return "{ \"name\": " + answer + "}";
    }
}
