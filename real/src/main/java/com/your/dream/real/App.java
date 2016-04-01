package com.your.dream.real;



public class App 
{
	private App() 
	{
	}
	
    public static void main( String[] args ) {
    
    	BasicPlan b;
    	AppView appview =new AppView();
    	
    
    	double line=2;
    	double time=400;
    	int plan=1;
    	if(plan==1){
    		b=new Gold(time,line);
    	}else{
    		b=new Silver(time,line);
    	}
    	
    	Calculator calcuator = new Calculator();
    	appview.printResult(b);
    	appview.printResult(calcuator.CalculatorBill(b));
    
    }
}
