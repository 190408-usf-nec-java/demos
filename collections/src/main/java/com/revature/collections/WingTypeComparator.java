package com.revature.collections;

import java.util.Comparator;

import com.revature.models.Wing;

public class WingTypeComparator implements Comparator<Wing>{

	@Override
	public int compare(Wing o1, Wing o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
