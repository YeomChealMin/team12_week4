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
