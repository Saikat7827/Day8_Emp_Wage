package com.bl.day8empwge;

import java.util.Random;

public class Daily_Wage {
	public static void main(String[] args) {

		int empHrs = 0;
		int wageperhr = 20;
		Random random = new Random();
		int randomnum = random.nextInt(2);

		if (randomnum == 1)
		{
			System.out.println("Employee is Present");
			empHrs = 8;

		}
		else 
			System.out.println("Employee is Absent");
		double salary = empHrs * wageperhr;
		System.out.println("Employee Wage is" +salary );
	}
}
