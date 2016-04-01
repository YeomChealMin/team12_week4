package com.your.dream.real;
public class App 
{
	private App() 
	{
	}	
    public static void main( String[] args ) {
    
    	BasicPlan b;
    	AppView appview =new AppView();
    	appview.showProgramStartMSG();
    	double line=appview.insertUsingLine();
    	double time=appview.insertUsingTime();
    	b=new Gold(time,line);
    	
    	Calculator calculator = new Calculator();
    	appview.printResult(b,calculator.CalculatorBill(b));
    	  
    }
}

