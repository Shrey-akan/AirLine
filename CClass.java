package com.airline;

public class CClass {
	
	public Ticket getClassss(int x) {
		if(x==0) {
			return null;
		}
		if(x==1) {
			return new EconomyClass();
		}
		else if(x==2) {
			return new BusinessClass();
		}
		return null;
	}
	
	
}
