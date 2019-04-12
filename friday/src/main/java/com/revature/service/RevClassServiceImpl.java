package com.revature.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.dao.RevClassDao;
import com.revature.dao.RevClassDaoImpl;
import com.revature.models.Associate;
import com.revature.models.Grade;


public class RevClassServiceImpl implements RevClassService {

	private RevClassDao rcd;
	
	
	public RevClassServiceImpl() {
		this.rcd = new RevClassDaoImpl();
	}
	
	
	
	public Set<Associate> findByAttendance(int classId) {
		// TODO Auto-generated method stub
		Set<Associate> associates = new HashSet<Associate>();
		for(Associate a : rcd.getAssociates(classId)) {
			if(a.getAttendance().containsValue(false)) {
				associates.add(a);
			}
		}
		
		return associates;
	}

	public List<Grade> calculateAvgGrades(int classId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
