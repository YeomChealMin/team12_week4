package com.your.dream.real;

import java.util.*;

public class AppView {
	//KimGwanYong Create
	
	private Scanner _scanner;
	
	public AppView(){
		_scanner = new Scanner(System.in);
	}
	
	//ProgramStartMessage
	public void showProgramStartMSG(){
		System.out.println("ActualCoding(Team_12)_Project: Bill Calculator is starting");
		System.out.println("Please insert Data");
	}
	
	public int insertPlan(){
		System.out.print("What's your using Plan?(Silver:1, Gold:2): ");
		return _scanner.nextInt();
	}
	
	public int insertUsingTime(){
		System.out.print("How much using time?(unit: second): ");
		return _scanner.nextInt();
	}
	
	public int insertUsingLine(){
		System.out.print("What's your using Line?");
		return _scanner.nextInt();
	}
	
	public void printResult(int bill){
		System.out.println("Your total charges are $"+bill);
	}
}
