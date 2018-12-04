package de.roskenet.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoingController {

    private static String VERSION = "1.0";
    
    class BoingResponse {
        private String version;
        private String message;
        
        public BoingResponse(String version, String message) {
            this.version = version;
            this.message = message;
        }

        public String getVersion() {
            return version;
        }

        public String getMessage() {
            return message;
        }
    }
    
    @GetMapping("/")
    public BoingResponse getRoot() {
        return new BoingResponse(VERSION, "Boing");
    }
}
