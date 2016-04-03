package com.your.dream.real;
public class Calculator {
	
	static final double FAMILY_DISCOUNT_FEE=5;//Family discount adapted
	
	public double calculatorBill(BasicPlan plan){
		double fee=plan.getBasicFee();//start calculator whit basic fee
		if(plan.getLine()<4)//Not adapted Family discount
			fee+=plan.getAdditinalFee()*(plan.getLine()-1);//Add additinal Fee whitout basic one
		else//Adapted Family discount
			fee+=plan.getAdditinalFee()*3+FAMILY_DISCOUNT_FEE*(plan.getLine()-4);//three additinal Fee and Family discount adapted
		if(plan.getMinit()>plan.getFreeTime()*plan.getLine())//if excess free time
			fee+=(plan.getMinit()-(plan.getFreeTime()*plan.getLine()))*plan.getExcessFee();//add excess fee where excessed minit
		return fee;//return total fee
	}
