package com.revature.objects;

public class Bear extends Animal implements Cloneable {

	//we get four fields from our parent
	
	private String furColor;
	
	private String favoriteFood = "honey";
	
	private static int numberOfBears;

	public static int getNumBears() {
		return numberOfBears;
	}
	
	@Override
	public String move() {
		return "I'm walking";
	}
	
//	public int familySize() {
//		return numberOfBears;
//	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	//a constructor with all 6 fields
	public Bear(String color, String species, int numberOfLegs, String name, String furColor, String favoriteFood) {
		super(color, species, numberOfLegs, name);
		this.furColor = furColor;
		this.favoriteFood = favoriteFood;
		numberOfBears++;
	}
	
	//A constructor without favfood to show default value
	public Bear(String color, String species, int numberOfLegs, String name, String furColor) {
		super(color, species, numberOfLegs, name);
		this.furColor = furColor;
		numberOfBears++;
	}

	
	//just the super constructor
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	//super with all fields
	public Bear(String color, String species, int numberOfLegs, String name) {
		super(color, species, numberOfLegs, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString() + "Bear [furColor=" + furColor + ", favoriteFood=" + favoriteFood + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((favoriteFood == null) ? 0 : favoriteFood.hashCode());
		result = prime * result + ((furColor == null) ? 0 : furColor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bear other = (Bear) obj;
		if (favoriteFood == null) {
			if (other.favoriteFood != null)
				return false;
		} else if (!favoriteFood.equals(other.favoriteFood))
			return false;
		if (furColor == null) {
			if (other.furColor != null)
				return false;
		} else if (!furColor.equals(other.furColor))
			return false;
		return true;
	}

	

	
	
	
	
	
	
	

	
}
