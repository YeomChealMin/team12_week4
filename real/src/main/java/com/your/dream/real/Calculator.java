package com.your.dream.real;
public class Calculator {
	
	final double FAMILY_DISCOUNTED_FEE=5;
	
	public double CalculatorBill(BasicPlan plan){
		double rate=0;
		if(plan.getLine()==1){
			rate+=plan.getBasicFee();
			if(plan.getMinit()>plan.getFreeTime())
				rate+=(plan.getMinit()-plan.getFreeTime())*plan.getExcessFee();
		}else if(plan.getLine()>=4){
			rate+=plan.getBasicFee()+plan.getAdditinalFee()*3+FAMILY_DISCOUNTED_FEE*(plan.getLine()-4);
			if(plan.getMinit()>plan.getFreeTime()*plan.getLine())
				rate+=(plan.getMinit()-(plan.getFreeTime()*plan.getLine()))*plan.getExcessFee();
		}else{
			rate+=plan.getBasicFee()+plan.getAdditinalFee()*(plan.getLine()-1);
			if(plan.getMinit()>plan.getFreeTime()*plan.getLine())
				rate+=(plan.getMinit()-(plan.getFreeTime()*plan.getLine()))*plan.getExcessFee();
		}

		return rate;
	}
}
