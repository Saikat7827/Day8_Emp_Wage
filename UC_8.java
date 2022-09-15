package com.bl.day8empwge;

import java.util.Scanner;

public class UC_8 {
	static int hoursPerDay = 8;
    void CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(int userInput , int workingDays , int hoursPerMonth, int wagePerHour){
            if (userInput == 1)
                System.out.println("The Monthly Wage of Employee based on total working days=" + wagePerHour * hoursPerDay * workingDays + " Rs");
            else if (userInput == 2)
                System.out.println("The Monthly Wage of Employee based on total working hours=" + wagePerHour * hoursPerMonth + " Rs");
            else
                System.out.println("Invalid Input from User");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for computing in days\nEnter 2 for computing in hour");
        int userInput = sc.nextInt();
        UC_8 wageForCompany1 = new UC_8();
        UC_8 wageForCompany2 = new UC_8();          //different  objects for multiple companies
        UC_8 wageForCompany3 = new UC_8();
        UC_8 wageForCompany4 = new UC_8();
        UC_8 wageForCompany5 = new UC_8();
        wageForCompany1.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 25 , 80, 20);
        wageForCompany2.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 20 , 100, 25);
        wageForCompany3.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 22 , 120, 18);
        wageForCompany4.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , 24 , 90, 30);
    }
}
