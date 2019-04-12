package com.revature.models;

public class Grade {

	
	private String gradeName;
	
	private double gradeValue;

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public double getGradeValue() {
		return gradeValue;
	}

	public void setGradeValue(double gradeValue) {
		this.gradeValue = gradeValue;
	}

	public Grade(String gradeName, double gradeValue) {
		super();
		this.gradeName = gradeName;
		this.gradeValue = gradeValue;
	}

	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gradeName == null) ? 0 : gradeName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(gradeValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Grade other = (Grade) obj;
		if (gradeName == null) {
			if (other.gradeName != null)
				return false;
		} else if (!gradeName.equals(other.gradeName))
			return false;
		if (Double.doubleToLongBits(gradeValue) != Double.doubleToLongBits(other.gradeValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Grade [gradeName=" + gradeName + ", gradeValue=" + gradeValue + "]";
	}
	
	
	
}
