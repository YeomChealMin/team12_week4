
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
    	
    
    	double line=_appview.insertUsingLine();
    	double time=_appview.insertUsingTime();
    	if(_appview.insertPlan()==1){//gold
    		b=new Gold(time,line);
    	}else{
    		b=new Silver(time,line);
    	}
    	
    	Calculator _calcuator = new Calculator();
    	
    	_appview.printResult(_calcuator.CalculatorBill(b));
    
    }
}
