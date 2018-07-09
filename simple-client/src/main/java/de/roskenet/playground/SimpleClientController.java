package de.roskenet.playground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SimpleClientController {

    @Autowired
    private RestTemplate restTemplate;
 
    static class Response {
        private String answer;

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
        
    }
    
    @GetMapping("/")
    public String callSimpleService() {

        ResponseEntity<Response> responseEntity = restTemplate.getForEntity("http://simple-service:8082/", Response.class);
        
//        System.out.println(responseEntity.getBody());
        
        String answer = responseEntity.getBody().answer;
        
        return "Simple service answered: " + answer;
    }
}
