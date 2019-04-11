package com.revature.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import com.revature.models.Wing;

public class CollectionLauncher {

	public static void main(String[] args) {
		List<Wing> wList = new Vector<Wing>();
		wList.add(new Wing("Mango Habenero", "Boneless",4));
		wList.add(new Wing("Garlic Parm", "Boneless",0));
		wList.add(new Wing("Buffalo", "Tenders",2));
		wList.add(new Wing("Spicy Hawaiian", "Boneless",3));
		wList.add(new Wing("Caribbean Jerk", "Bone-in",2));
		
		//System.out.println(wList);
		wList.forEach(wing -> {
			System.out.println("lamba Function wing:" + wing);
			if(wing.getName() == "Caribbean Jerk") {
				wing.setSpiceLevel(10000);
			}
		});
//		wList.forEach(wing -> {
//			System.out.println("lamba Function wing:" + wing);
//
//		});
//		for(Wing w : wList) {
//			
//		}
		Set<Wing> wSet = new TreeSet<Wing>();
		
		wSet.addAll(wList);
		System.out.println(wSet);
		WingTypeComparator wtc = new WingTypeComparator();
		wList.sort(wtc);
		System.out.println(wList);
		wList.sort((Wing o1, Wing o2) ->{
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		});
		System.out.println(wList);
		
	}

}
