package com.your.dream.real;
public class Silver implements BasicPlan	{

	final double basicFee=29.95;
	final double additionalFee=21.5;
	final double freeTime=500;
	final double excessFee=0.54;
	private double minit;
	private double line;
	
	public Silver(double aMinit, double aLine){
		this.minit = aMinit;
		this.line = aLine;
	}
	@Override
	public String plan() {
		return this.plan;
	}
	@Override
	public double BASIC_FEE() {
		return this.basicFee;
	}
	@Override
	public double ADDITIONAL_FEE() {
		return this.additionalFee;
	}
	@Override
	public double FREE_TIME() {
		return this.freeTime;
	}
	@Override
	public double EXCESS_FEE() {
		return this.excessFee;
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
