package com.your.dream.real;
public class Calculator {
	
	static final double FAMILY_DISCOUNT_FEE=5;
	
	public double calculatorBill(BasicPlan plan){
		double fee=plan.getBasicFee();
		if(plan.getLine()<4) 
			fee+=plan.getAdditinalFee()*(plan.getLine()-1);
		else
			fee+=plan.getAdditinalFee()*3+FAMILY_DISCOUNT_FEE*(plan.getLine()-4);
		if(plan.getMinit()>plan.getFreeTime()*plan.getLine())
			fee+=(plan.getMinit()-(plan.getFreeTime()*plan.getLine()))*plan.getExcessFee();
		return fee;
	}
}
