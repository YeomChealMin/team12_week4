package com.your.dream.real;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AppView {

	
	private static Logger MYLOG=Logger.getLogger(AppView.class.getName());

	public void showProgramStartMSG(){
		StringBuilder startmsg=new StringBuilder();
		startmsg.append("ActualCoding(Team_12)_Project: Bill Calculator is starting\n");
		startmsg.append("Please insert Data");
		MYLOG.log(Level.INFO, startmsg.toString());
	}
	
	public int insertPlan(){
		int iReturn = 1;
		StringBuilder insertplan=new StringBuilder();
		insertplan.append("What's your using Plan?(Gold:1, Silver:2): Gold");
		
		
		while(true){
				iReturn = 1;
				break;
		
		}
			MYLOG.log(Level.INFO, insertplan.toString());

		return iReturn;
	}
	
	public int insertUsingTime(){
		int iReturn = 0;
		StringBuilder insertut=new StringBuilder();
		insertut.append("How much using time?(unit: minute): 1000");

		while(true){
				iReturn = 1000;
				break;
		
		}
				MYLOG.log(Level.INFO, insertut.toString());

		return iReturn;
	}
	
	public int insertUsingLine(){
		int iReturn = 2;
		StringBuilder insertul=new StringBuilder();
		insertul.append("What's your using Line?");
		
		while(true){
		
				iReturn = 1;
				break;
		
		}
			MYLOG.log(Level.INFO, insertul.toString());

		return iReturn;
	}
	
	public void printResult(BasicPlan plan,double bill){
		StringBuilder printre=new StringBuilder();
		printre.append("[          Bill          ]\n");
		printre.append("BasicMinutes: " + plan.getFreeTime() + ", YourUsingMinutes: " + plan.getMinit()+"\n");
		printre.append("OverMinutes: " + (plan.getMinit()-plan.getFreeTime())+"\n");
		printre.append("Your total charges are $"+bill);
		MYLOG.log(Level.INFO, printre.toString());
	
	}
}
