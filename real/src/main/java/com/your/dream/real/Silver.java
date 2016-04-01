package com.your.dream.real;
public class Silver implements BasicPlan	{

	float cost;
	float discount_cost;
	int family_cost;
	int number;
	float time;
	
	public void cost_setter(float i) {
		// TODO Auto-generated method stub
		cost = i;
	}
	@Override
	public float cost_getter() {
		// TODO Auto-generated method stub
		return cost;
	}
	@Override
	public void discount_cost_setter(float i) {
		// TODO Auto-generated method stub
		discount_cost= i;
	}
	@Override
	public float discount_cost_getter() {
		// TODO Auto-generated method stub
		return discount_cost;
	}
	@Override
	public void family_cost_setter(int i) {
		// TODO Auto-generated method stub
		family_cost= i;
	}
	@Override
	public int family_cost_getter() {
		// TODO Auto-generated method stub
		return family_cost;
	}
	
}
