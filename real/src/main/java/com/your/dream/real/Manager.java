package com.your.dream.real;

public class Manager {
	
	int plan, usingTime, usingLine;
	AppView appView;
	
	public Manager(){
		appView = new AppView();
	}
	
	public void run(){
		appView.showProgramStartMSG();
		insertData();
	}
	
	public void insertData(){
		plan = appView.insertPlan();
		usingTime = appView.insertUsingTime();
		usingLine = appView.insertUsingLine();
	}
	
	public void output(double bill){
		appView.printResult(bill);
	}
}
