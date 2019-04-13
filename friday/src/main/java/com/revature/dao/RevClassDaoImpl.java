package com.revature.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.models.Associate;
import com.revature.models.Grade;
import com.revature.models.RevClass;

public class RevClassDaoImpl implements RevClassDao{

	private List<RevClass> allClasses;
	
	
	public RevClassDaoImpl() {
		this.allClasses = new ArrayList<RevClass>();
		this.allClasses.add(new RevClass(1, 1, new HashSet<Associate>(), "Alec", new ArrayList<String>()));
		this.allClasses.get(0).getAssignments().add("Core Java");
		this.allClasses.get(0).getAssignments().add("Quiz1");
		Associate bill = new Associate("Bill", new ArrayList<Grade>(), new HashMap<String, Boolean>());
		bill.getGrades().add(new Grade("Core Java", 80.00));
		bill.getGrades().add(new Grade("Quiz1", 90.00));
		bill.getAttendance().put("Monday", true);
		bill.getAttendance().put("Tuesday", true);
		bill.getAttendance().put("Wednesday", true);
		bill.getAttendance().put("Thursday", true);
		bill.getAttendance().put("Friday", false);
		
		this.allClasses.get(0).getStudents().add(bill);
		
		Associate devin = new Associate("Devin", new ArrayList<Grade>(), new HashMap<String, Boolean>());
		devin.getGrades().add(new Grade("Core Java", 20.00));
		devin.getGrades().add(new Grade("Quiz1", 50.00));
		
		this.allClasses.get(0).getStudents().add(devin);
		
		
	}
	
	
	public Set<Associate> getAssociates(int classId) {
		RevClass rc = null;
		
		for(RevClass r : this.allClasses)
		{
			if(r.getClassId() == classId) {
				rc = r;
			}
		}
		if(rc == null) {
			return null;
		}
		return rc.getStudents();
	}


	@Override
	public List<String> getAssignments(int classId) {
		RevClass rc = null;
		
		for(RevClass r : this.allClasses)
		{
			if(r.getClassId() == classId) {
				rc = r;
			}
		}
		if(rc == null) {
			return null;
		}
		return rc.getAssignments();
	}
	
	

}
