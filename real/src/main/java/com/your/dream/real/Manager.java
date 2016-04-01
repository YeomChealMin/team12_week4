package com.your.dream.real;

public class Manager {
	
	int plan, usingTime, usingLine;
	AppView _appView;
	
	public Manager(){
		_appView = new AppView();
	}
	
	public void run(){
		_appView.showProgramStartMSG();
		insertData();
	}
	
	public void insertData(){
		plan = _appView.insertPlan();
		usingTime = _appView.insertUsingTime();
		usingLine = _appView.insertUsingLine();
	}
	
	public void output(int bill){
		_appView.printResult(bill);
	}
}