package de.roskenet;

import java.util.ArrayList;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/contracts")
public class ContractController {

public class Contract {

    private String name;

    public Contract(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("#oauth2.hasScope('profile')")
    @ResponseBody
//    @CrossOrigin
    public List<Contract> getContracts(OAuth2Authentication auth) {
        
//        System.out.println(auth.getPrincipal()); 
//        SecurityContextHolder.getContext().getAuthentication().getName();
//        String username = auth.getUserAuthentication().getName();
        
//        System.out.println("hello : " + username);
        Contract a = new Contract("Backend called!");
        
        List<Contract> contracts = new ArrayList<>();
        contracts.add(a);
        
        return contracts;
    }


}

