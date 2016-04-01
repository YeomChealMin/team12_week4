package com.your.dream.real;
public class Silver implements BasicPlan	{

	private double minit;
	private double line;
	
	public Silver(double aMinit, double aLine){
		this.minit = aMinit;
		this.line = aLine;
	}
	
	@Override
	public double getBasicFee() {
		return 29.95;
	}
	@Override
	public double getAdditinalFee() {
		return 21.5;
	}
	@Override
	public double getFreeTime() {
		return 500;
	}
	@Override
	public double getExcessFee() {
		return 0.54;
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
