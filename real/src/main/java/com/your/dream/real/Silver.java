package com.your.dream.real;
public class Silver implements BasicPlan	{

	final String plan="Silver";
	private double minit;
	private double line;
	
	public Silver(double aMinit, double aLine){
		this.minit = aMinit;
		this.line = aLine;
	}
	@Override
	public double getMinit() {
		return this.minit;
	}

	@Override
	public void setMinit(double aMinit) {
		this.minit=aMinit;
	}

	@Override
	public double getLine() {
		return this.line;
	}

	@Override
	public void setLine(double aLine) {
		this.line = aLine;
	}
}
