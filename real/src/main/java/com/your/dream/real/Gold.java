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
	public double getBasicFee() {
		return this.basicFee;
	}
	@Override
	public double getAdditinalFee() {
		return this.additionalFee;
	}
	@Override
	public double getFreeTime() {
		return this.freeTime;
	}
	@Override
	public double getExcessFee() {
		return this.excessFee;
	}
	@Override
	public double getMinit() {
		return this.minit;
	}
	@Override
	public double getLine() {
		return this.line;
	}
}
