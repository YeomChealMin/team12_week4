package com.your.dream.real;

/**
 * Hello world!
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
    	
    	//while(){
    	_appview.showProgramStartMSG();
    	
    
    	int number=_appview.insertUsingLine();
    	float time=_appview.insertUsingTime();
    	if(_appview.insertPlan()==1){//gold
    		b=new Gold(number,time);
    	}else{
    		b=new Silver(number,time);
    	}
    	
    	Calculator _calcuator = new Calculator();
    	
    	_appview.printResult(_calcuator.CalculatorBill(b.plan(),b.Minit(),b.Line()));
    }
}
