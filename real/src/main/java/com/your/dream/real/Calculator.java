package com.your.dream.real;
public class Calculator {
	
	float cost;
	float discount_cost;
	int number;
	float time;
	int family_cost; 
	float total = 0;
	public Calculator(BasicPlan b, int number, float time){
		cost = b.cost_getter();
		discount_cost = b.discount_cost_getter();
		family_cost = b.family_cost_getter();
		this.number = number;
		this.time = time;
	}
	
	public float CalculatorBill(){
		
		total += cost; 
		number--;
		if(number == 1){
		total += discount_cost;
		number --;
		}
		if (number == 1){
			total += discount_cost;
			number --;
		}
		if( number != 0){
			total += family_cost * number;
		}
		return total;
		
	}
}
