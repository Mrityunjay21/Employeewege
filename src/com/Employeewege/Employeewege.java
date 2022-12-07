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
