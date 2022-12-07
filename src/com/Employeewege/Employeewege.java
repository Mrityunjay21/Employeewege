package com.Employeewege;

public class Employeewege {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random()*10%2);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else 
			System.out.println("Employee is Absent");
	}
}

package com.Employeewege;
//UC2
public class Employeewege {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs = 0;
		int empWege = 0;
		double empCheck = Math.floor(Math.random()*10%2);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else 
			 empHrs = 0;
		empWege = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee wege: " + empWege);
		
	}
}
package com.Employeewege;
//UC3
public class Employeewege {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR=20;
		int empHrs = 0;
		int empWege = 0;
		double empCheck = Math.floor(Math.random()*10%3);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else 
			 empHrs = 0;
		empWege = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee wege: " + empWege);
		
	}
}


package com.Employeewege;
//UC4Solving using switch case
public class Employeewege {
 
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWege = 0;
		int empCheck = (int)Math.floor(Math.random()*10%3);
		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
				
		}
		
		empWege = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee wege is : " + empWege);
		
	}
}

package com.Employeewege;
//UC5Calculating month wege
public class Employeewege {
 
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_WORKING_DAYS = 20;
	
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWege = 0;
		int totalempWege = 0;
		for (int day = 0;day <NUM_WORKING_DAYS;day++) {
		int empCheck = (int)Math.floor(Math.random()*10%3);
		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
				
		}
		
		empWege = empHrs * EMP_RATE_PER_HOUR;
		totalempWege+= empWege;
		System.out.println("Employee wege is : " + totalempWege);
		
	}
}
}

package com.Employeewege;
//UC6Calculating Working hr per month is reached
public class Employeewege {
 
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 12;
	
	
	public static void main(String[] args) {
		
		int empHrs = 0, totalempHrs = 0,totalWorkingDays = 0;
		while(totalempHrs <=MAX_HRS_IN_MONTH &&
				totalWorkingDays < NUM_WORKING_DAYS ) {
		totalWorkingDays++;
		
		int empCheck = (int)Math.floor(Math.random()*10%3);
		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
				
		}
		
		totalempHrs += empHrs ;
		System.out.println("Day: "+ totalWorkingDays + "Emp HR"+empHrs);
		}
		int totalEmpWege = totalempHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wege:" + totalEmpWege );
}
}

