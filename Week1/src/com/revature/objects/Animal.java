package com.revature.objects;

public class Animal {
	
	private String color;
	
	private String Species;
	
	private int numberOfLegs;
	
	private String name;
	
	String move () {
		return "I'm Moving";
	}
	
	String eat(String food) {
		return "I'm eating " + food;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpecies() {
		return Species;
	}

	public void setSpecies(String species) {
		Species = species;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String color, String species, int numberOfLegs, String name) {
		super();
		this.color = color;
		Species = species;
		this.numberOfLegs = numberOfLegs;
		this.name = name;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + ", Species=" + Species + ", numberOfLegs=" + numberOfLegs + ", name=" + name
				+ "]";
	}

	
}
