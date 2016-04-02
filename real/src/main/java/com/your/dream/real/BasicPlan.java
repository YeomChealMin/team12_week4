package com.your.dream.real;
public class BasicPlan {

	protected double basicFee; // 기본요금
	protected double additionalFee; // 같은 요금제 사용으로 인한 할인 요금
	protected double freeTime; // 요금제마다 주어진 사용 시간
	protected double excessFee; // 초과 시 분당 부과하는 % 요금
	protected double minit; // 사용자로부터 받는 총사용시간
	protected double line; // 사용자로부터 받는 사용회선 수
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

