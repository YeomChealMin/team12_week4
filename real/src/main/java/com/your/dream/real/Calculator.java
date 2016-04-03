package com.your.dream.real;
public class Calculator {
	
	static final double FAMILY_DISCOUNT_FEE=5;//가족할인이 적용된 요금
	
	public double calculatorBill(BasicPlan plan){
		double fee=plan.getBasicFee();//무조건 기본 요금부터 시작함으로
		if(plan.getLine()<4)//만약 가족할인이 적용되지 않는 경우  라인 추가 요금 
			fee+=plan.getAdditinalFee()*(plan.getLine()-1);//기본요금 한명을 제외한 라인추가요금
		else//가족할인이 적용될경우 라인추가+가족할인 요금
			fee+=plan.getAdditinalFee()*3+FAMILY_DISCOUNT_FEE*(plan.getLine()-4);//라인추가요금(3명)+가족할인요금
		if(plan.getMinit()>plan.getFreeTime()*plan.getLine())//만약 기본제공시간을 넘었다면
			fee+=(plan.getMinit()-(plan.getFreeTime()*plan.getLine()))*plan.getExcessFee();//넘은 시간에 대하여 추가 요금을 청구 
		return fee;//총 요금을 반환
	}
}
