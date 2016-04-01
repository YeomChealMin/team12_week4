package com.your.dream.real;
public class Calculator {
	
	final double FAMILY_DISCOUNTED_FEE=5;
	
	public Calculator(){
	}
	
<<<<<<< HEAD
	public double CalculatorBill(String plan, double minit, double line){
=======
	public double CalculatorBill(BasicPlan plan){
>>>>>>> 63475b7c7d76980d6128673a57fd4549424c9d60
		double rate=0;
		if(plan.Line()==1){
			rate+=plan.BASIC_FEE();
			if(plan.Minit()>plan.FREE_TIME())
				rate+=(plan.Minit()-plan.FREE_TIME())*plan.EXCESS_FEE();
		}else if(plan.Line()>=4){
			rate+=plan.BASIC_FEE()+plan.ADDITIONAL_FEE()*3+FAMILY_DISCOUNTED_FEE*(plan.Line()-4);
			if(plan.Minit()>plan.FREE_TIME()*plan.Line())
				rate+=(plan.Minit()-(plan.FREE_TIME()*plan.Line()))*plan.EXCESS_FEE();
		}else{
			rate+=plan.BASIC_FEE()+plan.ADDITIONAL_FEE()*(plan.Line()-5);
			if(plan.Minit()>plan.FREE_TIME()*plan.Line())
				rate+=(plan.Minit()-(plan.FREE_TIME()*plan.Line()))*plan.EXCESS_FEE();
		}

		return rate;
	}
}
