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
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Animal [color=" + color + ", Species=" + Species + ", numberOfLegs=" + numberOfLegs + ", name=" + name
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Species == null) ? 0 : Species.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfLegs;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (Species == null) {
			if (other.Species != null)
				return false;
		} else if (!Species.equals(other.Species))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfLegs != other.numberOfLegs)
			return false;
		return true;
	}

	
	
}
