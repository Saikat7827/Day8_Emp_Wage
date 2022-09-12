package com.bl.day8empwge;

import java.util.Random;

public class Random_Attendence {
	public static void absent() {

	Random random = new Random();
	long num = (long) (Math.random()*10);

	if(num%2==0) {
		System.out.println("Present");
	}
	else System.out.println("absent");

	}
	public static void main(String[] args) {
		absent();
	}
}
