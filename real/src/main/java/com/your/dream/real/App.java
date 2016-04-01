package com.your.dream.real;


/**
 * main program!
 *
 */
public class App 
{
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    
    	BasicPlan b;
    	AppView _appview =new AppView();
    	
    
    	double line=2;
    	double time=400;
    	int plan=1;
    	if(plan==1){
    		b=new Gold(time,line);
    	}else{
    		b=new Silver(time,line);
    	}
    	
    	Calculator _calcuator = new Calculator();
    	
    	_appview.printResult(_calcuator.CalculatorBill(b));
    
    }
}
