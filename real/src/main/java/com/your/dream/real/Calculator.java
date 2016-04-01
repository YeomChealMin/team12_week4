package com.your.dream.real;
public class Calculator {
	
	final double GOLD_BASIC_FEE=49.95;
	final double GOLD_ADDITIONAL_FEE=14.5;
	final double GOLD_FREE_TIME=1000;
	final double GOLD_EXCESS_FEE=0.45;
	final double SILVER_BASIC_FEE=29.95;
	final double SILVER_ADDITIONAL_FEE=21.5;
	final double SILVER_FREE_TIME=500;
	final double SILVER_EXCESS_FEE=0.54;
	final double FAMILY_DISCOUNTED_FEE=5;
	
	public Calculator(){
	}
	
	public double CalculatorBill(String plan, double minit, int line){
		double rate=0;
		if(plan=="Gold"){
			if(line==1){
				rate+=GOLD_BASIC_FEE;
				if(minit>GOLD_FREE_TIME)
					rate+=(minit-GOLD_FREE_TIME)*GOLD_EXCESS_FEE;
			}else if(line>=5){
				rate+=GOLD_BASIC_FEE+GOLD_ADDITIONAL_FEE*4+FAMILY_DISCOUNTED_FEE*(line-5);
				if(minit>GOLD_FREE_TIME*line)
					rate+=(minit-(GOLD_FREE_TIME*line))*GOLD_EXCESS_FEE;
			}else{
				rate+=GOLD_BASIC_FEE+GOLD_ADDITIONAL_FEE*(line-5);
				if(minit>GOLD_FREE_TIME*line)
					rate+=(minit-(GOLD_FREE_TIME*line))*GOLD_EXCESS_FEE;
			}
		}else{
			if(line==1){
				rate+=SILVER_BASIC_FEE;
				if(minit>SILVER_FREE_TIME)
					rate+=(minit-SILVER_FREE_TIME)*SILVER_EXCESS_FEE;
			}else if(line>=5){
				rate+=SILVER_BASIC_FEE+SILVER_ADDITIONAL_FEE*4+FAMILY_DISCOUNTED_FEE*(line-5);
				if(minit>SILVER_FREE_TIME*line)
					rate+=(minit-(SILVER_FREE_TIME*line))*SILVER_EXCESS_FEE;
			}else{
				rate+=SILVER_BASIC_FEE+SILVER_ADDITIONAL_FEE*(line-5);
				if(minit>SILVER_FREE_TIME*line)
					rate+=(minit-(SILVER_FREE_TIME*line))*SILVER_EXCESS_FEE;
			}
		}
		return rate;
	}
}
