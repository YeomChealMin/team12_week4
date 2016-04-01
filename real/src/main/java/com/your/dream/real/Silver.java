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
