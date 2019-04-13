package com.revature.userfacing;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.service.RevClassService;
import com.revature.service.RevClassServiceImpl;

public class RevAdminLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = LogManager.getRootLogger();
		Scanner uI = new Scanner(System.in);
		RevClassService  rcs = new RevClassServiceImpl();
		log.info("What would you like to do at Revature Admin?");
		while(true) {
			
			String userInput = uI.nextLine();
			switch(userInput) {
				case "findByAttendance":{
					log.info("What Class would you like the Attendance of?");
					int classId = uI.nextInt();
					rcs.findByAttendance(classId).forEach(assoc->{
						log.info(assoc);
					});;
					uI.nextLine();
					break;
				}
				case "AvgGrades":{
					log.info("Average Grades of What Class?");
					int classId = uI.nextInt();
					rcs.calculateAvgGrades(classId).forEach(grade->{
						log.info(grade);
					});
					uI.nextLine();
					break;
				}
				default:{
					log.info("Invalid Command");
					log.info("Valid Commands are: ");
					log.info("findByAttendance");
					log.info("AvgGrades");			}
			}
			
			
			
		}

	}

}
