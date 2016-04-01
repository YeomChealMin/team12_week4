package com.your.dream.real;

/**
 * Hello world!
 *
 */
public class App 
{
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
	int total =0;
	
	final int gold_excess_rate=0.45;
	final int gold_basic = 49.95;
	final int gold_addition = 14.50;	
	final int gold_include_minutes=1000;
	final int silver_excess=0.54;
	final int silver_basic = 29.95;
	final int gold_addition = 21.50;
	final int siver_include_minutes=500;
	
    	for(String arg : args) {
		System.out.println("Lego.");
    		System.out.println("++parameter: " + arg);
		
		System.out.println("Total fare is "+ total +".");
    	}
    }
}
