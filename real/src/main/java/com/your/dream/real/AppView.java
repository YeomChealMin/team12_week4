package com.your.dream.real;

import java.util.*;

public class AppView {
	//KimGwanYong Create
	
	private Scanner _scanner;
	
	public AppView(){
		_scanner = new Scanner(System.in);
	}
	
	public void showProgramStartMSG(){
		//ProgramStartMessage
		System.out.println("ActualCoding(Team_12)_Project: Bill Calculator is starting");
		System.out.println("Please insert Data");
	}
	
	public int insertPlan(){
		//Insert Plan data from User
		//Return: 1(Gold), 2(Silver)
		int iReturn = 0;
		System.out.print("What's your using Plan?(Gold:1, Silver:2): ");
		
		while(true){
			try{
				iReturn = _scanner.nextInt();
				break;
			} catch(InputMismatchException e){
				System.out.print("Please input correctly(num[1 or 2]): ");
				_scanner.nextLine();
			}
		}
		
		return iReturn;
	}
	
	public int insertUsingTime(){
		//Insert using time data from User
		//Return: usingTime(minute)
		int iReturn = 0;
		System.out.print("How much using time?(unit: minute): ");
		while(true){
			try{
				iReturn = _scanner.nextInt();
				break;
			} catch(InputMismatchException e){
				System.out.print("Please input Using-Time with number(unit: minute): ");
				_scanner.nextLine();
			}
		}
		
		return iReturn;
	}
	
	public int insertUsingLine(){
		//Insert using line from User
		//Return: UsingLine
		int iReturn = 0;
		System.out.print("What's your using Line?");
		while(true){
			try{
				iReturn = _scanner.nextInt();
				break;
			} catch(InputMismatchException e){
				System.out.print("Please input correctly Using-Line with number: ");
				_scanner.nextLine();		//
			}
		}
		
		return iReturn;
	}
	
	public void printResult(int bill){
		//Print bill to User
		System.out.println("Your total charges are $"+bill);
	}
}
