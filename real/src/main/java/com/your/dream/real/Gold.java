package com.your.dream.real;
public class Gold implements BasicPlan	{

	final double basicFee=49.95;
	final double additionalFee=14.5;
	final double freeTime=1000;
	final double excessFee=0.45;
	private double minit;
	private double line;
	
	public Gold(double aMinit, double aLine){
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
