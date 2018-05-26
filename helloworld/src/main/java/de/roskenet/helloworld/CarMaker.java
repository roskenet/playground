package de.roskenet.helloworld;

import java.util.Optional;

public class CarMaker {

	private String name;
	private Optional<Integer> founded;

	public CarMaker(String name, int founded) {
		this.name = name;
		this.founded = Optional.of(founded);
	}

	public CarMaker(String name) {
		this.name = name;
		this.founded = Optional.empty();
	}

	public String getName() {
		return name;
	}

	public Optional<Integer> getFounded() {
		return founded;
	}

}
