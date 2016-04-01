

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
    	if(_appview.insertPlan()==1){//gold
    		b=new Gold();
    	}else{
    		b=new Silver();
    	}
    
    	int number=_appview.insertUsingLine();
    	float time=_appview.insertUsingTime();
    	
    	
    	Calculator _calcuator = new Calculator(b, number, time);
    	
    	_appview.printResult(_calcuator.CalculatorBill());
    }
}
