package com.your.dream.real;
public class BasicPlan {

	protected double basicFee; 
	protected double additionalFee; 
	protected double freeTime; 
	protected double excessFee; 
	protected double minit; 
	protected double line; 
	public BasicPlan(double aBasicFee, double aAdditionalFee, double aFreeTime, double aExcessFee, double aMinit, double aLine){
		this.basicFee = aBasicFee;
		this.additionalFee = aAdditionalFee;
		this.freeTime = aFreeTime;
		this.excessFee = aExcessFee;
		this.minit = aMinit;
		this.line = aLine;
	}
	
	public double getBasicFee() {
		return basicFee;
	}
	public double getAdditinalFee() {
		return additionalFee;
	}
	public double getFreeTime() {
		return freeTime;
	}
	public double getExcessFee() {
		return excessFee;
	}
	public double getMinit() {
		return minit;
	}
	public double getLine() {
		return line;
	}	
}

