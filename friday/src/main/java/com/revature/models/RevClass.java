package com.revature.models;

import java.util.List;
import java.util.Set;

public class RevClass {

	private int classId;
	
	
	private int numStudents;
	
	private Set<Associate> students;
	
	private String trainer;
	
	private List<String> assignments;

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public Set<Associate> getStudents() {
		return students;
	}

	public void setStudents(Set<Associate> students) {
		this.students = students;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<String> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<String> assignments) {
		this.assignments = assignments;
	}

	public RevClass(int classId, int numStudents, Set<Associate> students, String trainer, List<String> assignments) {
		super();
		this.classId = classId;
		this.numStudents = numStudents;
		this.students = students;
		this.trainer = trainer;
		this.assignments = assignments;
	}

	public RevClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RevClass [classId=" + classId + ", numStudents=" + numStudents + ", students=" + students + ", trainer="
				+ trainer + ", assignments=" + assignments + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assignments == null) ? 0 : assignments.hashCode());
		result = prime * result + classId;
		result = prime * result + numStudents;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
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
		RevClass other = (RevClass) obj;
		if (assignments == null) {
			if (other.assignments != null)
				return false;
		} else if (!assignments.equals(other.assignments))
			return false;
		if (classId != other.classId)
			return false;
		if (numStudents != other.numStudents)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
			return false;
		return true;
	}

	
	
	
}
