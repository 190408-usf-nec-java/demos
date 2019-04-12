package com.revature.service;

import java.util.List;
import java.util.Set;

import com.revature.models.Associate;
import com.revature.models.Grade;
import com.revature.models.RevClass;

public interface RevClassService {

	Set<Associate> findByAttendance(int classId);
	
	List<Grade> calculateAvgGrades(int classId);
	
	
}
