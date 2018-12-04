package de.roskenet.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarMakerController {
    private static Logger LOG = LoggerFactory.getLogger(CarMakerController.class);
    
	@GetMapping("/car/{name}")
	public CarMaker getByName(@PathVariable("name") String name) {
	    LOG.debug("A log statement");
	    LOG.info("Another log statement");
	    
		if("BMW".equals(name)) {
			return new CarMaker("Bayrische Motorenwerke", 1916);
		}
			return null;
	}
}
