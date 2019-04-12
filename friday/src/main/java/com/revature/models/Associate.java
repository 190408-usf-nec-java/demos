package com.revature.models;

import java.util.List;
import java.util.Map;

public class Associate {

	private String name;
	
	private List<Grade> grades;
	
	private Map<String, Boolean> attendance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public Map<String, Boolean> getAttendance() {
		return attendance;
	}

	public void setAttendance(Map<String, Boolean> attendance) {
		this.attendance = attendance;
	}

	public Associate(String name, List<Grade> grades, Map<String, Boolean> attendance) {
		super();
		this.name = name;
		this.grades = grades;
		this.attendance = attendance;
	}

	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Associate [name=" + name + ", grades=" + grades + ", attendance=" + attendance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attendance == null) ? 0 : attendance.hashCode());
		result = prime * result + ((grades == null) ? 0 : grades.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Associate other = (Associate) obj;
		if (attendance == null) {
			if (other.attendance != null)
				return false;
		} else if (!attendance.equals(other.attendance))
			return false;
		if (grades == null) {
			if (other.grades != null)
				return false;
		} else if (!grades.equals(other.grades))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
