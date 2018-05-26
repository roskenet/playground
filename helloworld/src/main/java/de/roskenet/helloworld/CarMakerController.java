package de.roskenet.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarMakerController {

	@GetMapping("/car/{name}")
	public CarMaker getByName(@PathVariable("name") String name) {
		if("BMW".equals(name)) {
			return new CarMaker("Bayrische Motorenwerke", 1916);
		}
			return null;
	}
}
