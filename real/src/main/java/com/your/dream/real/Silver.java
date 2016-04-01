package com.your.dream.real;
public class Silver implements BasicPlan	{

	final double BASIC_FEE=29.95;
	final double ADDITIONAL_FEE=21.5;
	final double FREE_TIME=500;
	final double EXCESS_FEE=0.54;
	private double minit;
	private double line;
	
	public Silver(double aMinit, double aLine){
		this.minit = aMinit;
		this.line = aLine;
	}
	@Override
	public String plan() {
		return this.PLAN;
	}
	@Override
	public double BASIC_FEE() {
		return this.BASIC_FEE;
	}
	@Override
	public double ADDITIONAL_FEE() {
		return this.ADDITIONAL_FEE;
	}
	@Override
	public double FREE_TIME() {
		return this.FREE_TIME;
	}
	@Override
	public double EXCESS_FEE() {
		return this.EXCESS_FEE;
	}
	@Override
	public double Minit() {
		return this.minit;
	}
	@Override
	public double Line() {
		return this.line;
	}
}
