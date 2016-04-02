package com.your.dream.real;

import java.io.IOException;
import java.util.List;

public class App 
{
	private App() 
	{
	}	
    public static void main( String[] args ) throws IOException {
    
    	BasicPlan b;
    	AppView appview =new AppView();
    	appview.showProgramStartMSG();
    	double line=appview.insertUsingLine();
    	double time=appview.insertUsingTime();
    	b=new Gold(time,line);
    	
    	Calculator calculator = new Calculator();
    	
    	List<BasicPlan> parseData = appview.parseDataFromFile("Data.txt");
		
    	if(parseData != null)
    		for(int i=0; i<parseData.size(); i++)
    			appview.printResult(parseData.get(i), calculator.calculatorBill(parseData.get(i)));
    }
}

