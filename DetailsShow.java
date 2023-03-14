package com.airline;

import java.util.ArrayList;
import java.util.List;

public class DetailsShow {
	List<Details> listd;
	public DetailsShow() {
		listd = new ArrayList<Details>();
		Details d1 = new Details("Agra", "Delhi");
		Details d2 = new Details("Agra", "Bangalore");
		Details d3 = new Details("Delhi", "Bemgalore");
		Details d4 = new Details("Chennai", "Delhi");
		Details d5 = new Details("Hydrabad", "Delhi");
		Details d6 = new Details("Goa", "Delhi");
		Details d7 = new Details("Bengalore", "Delhi");
		listd.add(d7);
		listd.add(d6);
		listd.add(d5);
		listd.add(d4);
		listd.add(d3);
		listd.add(d2);
		listd.add(d1);
	}
	public List<Details> getAllD(){
		return listd;
	}
	public void updateOne(int x, Details dd) {
		listd.set(x, dd);
		System.out.println("Updated");
	}
	public void deleteDetails(int ddt) {
		listd.remove(ddt);
		System.out.println("Deleted");
	}
	public void AddDetail(Details ddt1) {
		listd.add(ddt1);
		System.out.println("Added");
	}
}
