package com.airline;

public abstract class Ticket {
	 protected double rate;
	 abstract void getrate();
	 
	 public double calculateFair(int  noofperson) {
		 	return (noofperson*rate);
	 }
	 
}
