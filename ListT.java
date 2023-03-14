package com.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListT {
	
	List<InfoD> dd;
	Random r = new Random();
	int x = r.nextInt(1000);
	int x1 = r.nextInt(1000);
	int x2 = r.nextInt(1000);
	int x3 = r.nextInt(1000);
	int x4 = r.nextInt(1000);
	int x5 = r.nextInt(1000);
	int x6 = r.nextInt(1000);
	
	public ListT() {
		dd = new ArrayList<InfoD>();
		InfoD d1 = new InfoD(x, "AirAsia");
		InfoD d2 = new InfoD(x2, " Vistara");
		InfoD d3 = new InfoD(x3, "SpiceJet");
		InfoD d4 = new InfoD(x4, "Akasa Air");
		InfoD d5 = new InfoD(x5, "GoAir");
		InfoD d6 = new InfoD(x6, "Air India Express");
		dd.add(d6);
		dd.add(d5);
		dd.add(d4);
		dd.add(d3);
		dd.add(d1);
		dd.add(d2);
	}
	public List<InfoD> getAllDT(){
		return dd;
	}
	public InfoD getOne(int string) {
		return dd.get(string);
	}
	
}
