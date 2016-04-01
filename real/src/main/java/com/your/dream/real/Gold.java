package com.your.dream.real;
public class Gold implements BasicPlan	{

	private double minit;
	private double line;
	
	public Gold(double aMinit, double aLine){
		this.minit = aMinit;
		this.line = aLine;
	}
	@Override
	public double getBasicFee() {
		return 49.95;
	}
	@Override
	public double getAdditinalFee() {
		return 14.5;
	}
	@Override
	public double getFreeTime() {
		return 1000;
	}
	@Override
	public double getExcessFee() {
		return 0.45;
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
