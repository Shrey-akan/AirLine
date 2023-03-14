package com.airline;

import java.util.ArrayList;
import java.util.List;

public class From {
	
	List<ShowClass> list1 ;
	public From() {
		list1 = new ArrayList<ShowClass>();
		ShowClass s1 = new ShowClass("Agra");
		ShowClass s2 = new ShowClass("Delhi");
		ShowClass s3 = new ShowClass("Bangalore");
		ShowClass s4 = new ShowClass("Chennai");
		ShowClass s5 = new ShowClass("Pune");
		ShowClass s6 = new ShowClass("Hydrabad");
		list1.add(s6);
		list1.add(s5);
		list1.add(s4);
		list1.add(s3);
		list1.add(s2);
		list1.add(s1);
		
		
	}
	public List<ShowClass> getAll(){
		return list1;
	}
	
	public void updateFrom( int nn ,ShowClass newpl ) {
		list1.set(nn, newpl);
		System.out.println("Added");
	}
	
	public void deleteFrom(int nnn) {
		list1.remove(nnn);
		System.out.println("Deleted ");
	}
	public void addFrom(ShowClass nmnmnm) {
		list1.add(nmnmnm);
		System.out.println("Added");
	}
}
