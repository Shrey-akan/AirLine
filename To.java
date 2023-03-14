package com.airline;

import java.util.ArrayList;
import java.util.List;

public class To {
	List<ShowClass> list2;
	public To() {
		list2 = new ArrayList<ShowClass>();
		ShowClass t1 = new ShowClass("Chennai");
		ShowClass t2 = new ShowClass("Agra");;
		ShowClass t3 = new ShowClass("Pune");
		ShowClass t4 = new ShowClass("Bangalore");
		ShowClass t5 = new ShowClass("Mumbai");
		ShowClass t6 = new ShowClass("Goa");
		ShowClass t7 = new ShowClass("Varanasi");
		ShowClass t8 = new ShowClass("Hydrabad");
		
		list2.add(t1);
		list2.add(t2);
		list2.add(t3);
		list2.add(t4);
		list2.add(t5);
		list2.add(t6);
		list2.add(t7);
		list2.add(t8);
	
	}
	public List<ShowClass> getAll1(){
		return list2;
	}
	public void updateTo(int nmn,ShowClass bnb) {
		list2.set(nmn, bnb);
		System.out.println("Updated");
	}
	public void deleteTo(int nmnm) {
		list2.remove(nmnm);
		System.out.println("Removed Successfully");
	}
	public void addTo(ShowClass nmn) {
		list2.add(nmn);
		System.out.println("Added");
	}
}
