package com.bl.day8empwge;

public class Switch_Case_EmpWge {
	public static final int Is_Partime = 1;
	public static final int Is_Fulltime = 2;
	public static final int Emp_Rate_Phr = 20;


	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck)
		{
		case Is_Partime:
			empHrs = 4;
			break;
		case Is_Fulltime:
			empHrs = 8;
			break;
			default:
				empHrs = 0;


		}
		empWage = empHrs * Emp_Rate_Phr;
		System.out.println("Emp Wage:" + empWage);
			}
}
