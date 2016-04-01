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
    	if(appview.insertPlan()==1){//gold
    		b=new Gold(time,line);
    	}else{
    		b=new Silver(time,line);
    	}
    	
    	Calculator calcuator = new Calculator();
    	appview.printResult(b,calcuator.CalculatorBill(b));
    	  
    }
}
