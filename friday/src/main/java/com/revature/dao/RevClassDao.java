package com.revature.dao;

import java.util.List;
import java.util.Set;

import com.revature.models.Associate;

public interface RevClassDao {

	Set<Associate> getAssociates(int classId);
	
}
