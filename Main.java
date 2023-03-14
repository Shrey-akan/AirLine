package com.airline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Creating object of From 
		From from = new From();
		//Creating object of to
		To too = new To();
		//Creating object of DetailsShow 
		DetailsShow dsc = new DetailsShow();
		//Creating object of CClass
		CClass be = new CClass();
		//Creating object of ListT 
		ListT obj = new ListT();
		System.out.println("Welcome to Beliver's AirLines");
		while(true) {
			System.out.println("1.Admin \n2.User \n3.Exit");
			int chh = Integer.parseInt(br.readLine());
			if(chh==1) {
				while(true) {
						
					System.out.println("1.Admin \n2.Exit");
					int ch11 = Integer.parseInt(br.readLine());
					if(ch11==1) {
						
						System.out.println("Enter Your First Name ");
						String fname = br.readLine().concat(" ");
						System.out.println("Enter Your Last Name ");
						String lname = br.readLine();
						System.out.println("Enter your Mobile number");
						String unumber = br.readLine();
						System.out.println("Enter your age");
						int uage =  Integer.parseInt(br.readLine());
						System.out.println("Enter Your Password ");
						String upassword = br.readLine();
						System.out.println("Select Gender \n1.Male \n2.Female");
						int ch1 = Integer.parseInt(br.readLine());
						String ugender = null ;
						if(ch1==1) {
							 ugender = "Male";
						}
						else if(ch1==2) {
							 ugender = "Female";
						}
						else {
							System.out.println("Enter correct  Gender");
						}
						System.out.println(ugender);
						System.out.println("Enter City Name ");
						String ucity = br.readLine();
						System.out.println("Enter State Name ");
						String ustate = br.readLine();
						System.out.println("Enter Pin Code");
						int upin =  Integer.parseInt(br.readLine());
						System.out.println("Enter Country Name ");
						String ucountry = br.readLine();
						System.out.println();
						System.out.println("------------------------------");
						System.out.println("Please re-check all the details you enter and  confirm it by writing OK");
						System.out.println("------------------------------");
						Date date = new Date();
						SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
						String d =  f.format(date);
						Random rnum = new Random();
						int unid = rnum.nextInt(1000);
						System.out.println("------------------------------");
						System.out.println("|        Customer ID   : "+unid);
						System.out.println("|        Name          : "+fname.concat(lname));
						System.out.println("|        Mobile No.    : "+ unumber);
						System.out.println("|        Age           : "+uage);
						System.out.println("|        Gender        : "+ugender);
						System.out.println("|        City          : "+ucity.toUpperCase());
						System.out.println("|        State         : "+ustate.toUpperCase());
						System.out.println("|        PIN           : "+upin);
						System.out.println("|        Country       : "+ucountry.toUpperCase());
						System.out.println("--------------------------------");
						System.out.println("Confirm Your Password ");
						String cupassword = br.readLine();
						if(cupassword.equalsIgnoreCase(upassword)) {
							String ok = br.readLine();
							if(ok.equalsIgnoreCase("OK")) {
								System.out.println("Saved in Database");
								System.out.println("--------------------------------");
								System.out.println("Log-In");
								System.out.println("Enter your Name ");
								String name = br.readLine();
								System.out.println("Enter your Customer ID ");
								String cid = br.readLine();
								System.out.println("Enter Password");
								String password = br.readLine();	
								if((name.equalsIgnoreCase(fname.concat(lname)))&&password.equals(upassword)) {
									System.out.println("Done");
									System.out.println("--------------------------------");
									System.out.println();
									System.out.println("--------------------------------");
									
									
									//Using from object and to to update delete add
									
								
									
									
									System.out.println("Select \n1.Update \n2.Delete \n3.Add");
									int select = Integer.parseInt(br.readLine());
									if(select==1) {
										for(ShowClass sc : from.getAll()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										
										
										System.out.println("Enter The Place You Want To Update");
										
										int nnn = Integer.parseInt(br.readLine());
										
										
										System.out.println("Enter The Place You Want To Update");
										
										String newpl = br.readLine();
										
										
										ShowClass sv = from.getAll().get(nnn-1);
										sv.setPlace(newpl);
										from.updateFrom(nnn-1,sv);
										System.out.println("--------------------------------");
										for(ShowClass sc : from.getAll()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										
										for(ShowClass sc : too.getAll1()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										System.out.println("Enter The Place You Want To Update");
										int nnn1 = Integer.parseInt(br.readLine());
										
										System.out.println("Enter The Place You Want To Update");
										String nnto = br.readLine();
										
										ShowClass sv1 = too.getAll1().get(nnn1-1);
										sv1.setPlace(nnto);
										too.updateTo(nnn1-1,sv1);
										System.out.println("--------------------------------");
										for(ShowClass sc : too.getAll1()) {
											System.out.println(sc.getPlace());
										}
										
										System.out.println();
										System.out.println("------------------------------");
										for(Details ddt : dsc.getAllD()) {
											System.out.println("                              From : "+ ddt.getFromu()+"                 To : "+ddt.getTou());
										}
										System.out.println("Enter where you want to add");
										int nmn = Integer.parseInt(br.readLine());
										
										
										
										Details ddc = dsc.getAllD().get(nmn-1);
										ddc.setFromu(newpl);
										ddc.setTou(nnto);
										dsc.updateOne(nmn-1, ddc);
										System.out.println("------------------------------");
										for(Details ddt : dsc.getAllD()) {
											System.out.println("                              From : "+ ddt.getFromu()+"                      To : "+ddt.getTou());
										}
										System.out.println("------------------------------");
										
										
										
										
									}
									else if(select==2) {
										for(ShowClass sc : from.getAll()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										System.out.println("Enter The Place You Want To Delete");
										
										int nnn = Integer.parseInt(br.readLine());
										System.out.println("Enter The Place You Want To Delete");
										
										String newpl = br.readLine();
										
										ShowClass sv = from.getAll().get(nnn-1);
										
										from.deleteFrom(nnn-1);
										System.out.println("--------------------------------");
										for(ShowClass sc : from.getAll()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");

										for(ShowClass sc : too.getAll1()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										System.out.println("Enter The Place You Want To Delete");
										int nnn1 = Integer.parseInt(br.readLine());
										
										System.out.println("Enter The Place You Want To Delete");
										String nnto = br.readLine();
										
										ShowClass sv1 = too.getAll1().get(nnn1-1);
									
										too.deleteTo(nnn1-1);
										System.out.println("--------------------------------");
										for(ShowClass sc : too.getAll1()) {
											System.out.println(sc.getPlace());
										}
										
										System.out.println();
										System.out.println("------------------------------");
										
										for(Details ddt : dsc.getAllD()) {
											System.out.println("                              From : "+ ddt.getFromu()+"                 To : "+ddt.getTou());
										}
										System.out.println("Enter where you want to Delete");
										int nmn = Integer.parseInt(br.readLine());
										
										
										
										Details ddc = dsc.getAllD().get(nmn-1);
										
										dsc.deleteDetails(nmn-1);
										System.out.println("------------------------------");
										for(Details ddt : dsc.getAllD()) {
											System.out.println("                              From : "+ ddt.getFromu()+"                      To : "+ddt.getTou());
										}
										System.out.println("------------------------------");
									}
									else if(select==3) {
										for(ShowClass sc : from.getAll()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										System.out.println("Enter The Place You Want To Add");
										
										int nnn = Integer.parseInt(br.readLine());
										System.out.println("Enter The Place You Want To Add");
										
										String newpl = br.readLine();
										
										ShowClass sv = from.getAll().get(nnn-1);
										sv.setPlace(newpl);
										from.addFrom(sv);
										
										System.out.println("--------------------------------");
										for(ShowClass sc : from.getAll()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");

										for(ShowClass sc : too.getAll1()) {
											System.out.println(sc.getPlace());
										}
										System.out.println("--------------------------------");
										System.out.println("Enter The Place You Want To Add");
										int nnn1 = Integer.parseInt(br.readLine());
										
										System.out.println("Enter The Place You Want To Add");
										String nnto = br.readLine();
										
										ShowClass sv1 = too.getAll1().get(nnn1-1);
										sv1.setPlace(nnto);
										too.addTo(sv1);
										System.out.println("--------------------------------");
										for(ShowClass sc : too.getAll1()) {
											System.out.println(sc.getPlace());
										}
										
										System.out.println();
										System.out.println("------------------------------");
										
										for(Details ddt : dsc.getAllD()) {
											System.out.println("                              From : "+ ddt.getFromu()+"                 To : "+ddt.getTou());
										}
										System.out.println("Enter where you want to Add");
										int nmn = Integer.parseInt(br.readLine());
										
										
										
										Details ddc = dsc.getAllD().get(nmn-1);
										ddc.setFromu(newpl);
										ddc.setTou(nnto);
										dsc.AddDetail(ddc);
										
										System.out.println("------------------------------");
										for(Details ddt : dsc.getAllD()) {
											System.out.println("                              From : "+ ddt.getFromu()+"                      To : "+ddt.getTou());
										}
										System.out.println("------------------------------");
									}
									System.out.println("--------------------------------");
									
									
							
								}
								else {
									System.out.println("Please Enter Valid Information");
								}
								
							}
							else {
								System.out.println("Please Enter OK to Confirm");
							}
						}
						else {
							System.out.println("Enter Your Coreect Password");
						}
					}
					else if(ch11==2) {
						break;
					}
					}
					
			}
			else if(chh==2) {
				while(true) {
			System.out.println("1.Log-in \n2.Sign-in \n3.Exit");
			System.out.println("Enter choice");
			int ch = Integer.parseInt(br.readLine());
			if(ch==1) {
				System.out.println("Enter your Name ");
				String name = br.readLine();
				System.out.println("Enter your Customer ID ");
				String cid = br.readLine();
				System.out.println("Enter Password");
				String password = br.readLine();	
			}
			else if(ch==2) {
				System.out.println("Enter Your First Name ");
				String fname = br.readLine().concat(" ");
				System.out.println("Enter Your Last Name ");
				String lname = br.readLine();
				System.out.println("Enter your Mobile number");
				String unumber = br.readLine();
				System.out.println("Enter your age");
				int uage =  Integer.parseInt(br.readLine());
				System.out.println("Enter Your Password ");
				String upassword = br.readLine();
				System.out.println("Select Gender \n1.Male \n2.Female");
				int ch1 = Integer.parseInt(br.readLine());
				String ugender = null ;
				if(ch1==1) {
					 ugender = "Male";
				}
				else if(ch1==2) {
					 ugender = "Female";
				}
				else {
					System.out.println("Enter correct  Gender");
				}
				System.out.println(ugender);
				System.out.println("Enter City Name ");
				String ucity = br.readLine();
				System.out.println("Enter State Name ");
				String ustate = br.readLine();
				System.out.println("Enter Pin Code");
				int upin =  Integer.parseInt(br.readLine());
				System.out.println("Enter Country Name ");
				String ucountry = br.readLine();
				System.out.println();
				System.out.println("------------------------------");
				System.out.println("Please re-check all the details you enter and  confirm it by writing OK");
				System.out.println("------------------------------");
				Date date = new Date();
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yy");
				String d =  f.format(date);
				Random rnum = new Random();
				int unid = rnum.nextInt(1000);
			
				System.out.println(" Date          : "+d);
				System.out.println(" Customer ID   : "+unid);
				System.out.println(" Name          : "+fname.concat(lname));
				System.out.println(" Mobile No.    : "+ unumber);
				System.out.println(" Age           : "+uage);
				System.out.println(" Gender        : "+ugender);
				System.out.println(" City          : "+ucity.toUpperCase());
				System.out.println(" State         : "+ustate.toUpperCase());
				System.out.println(" PIN           : "+upin);
				System.out.println(" Country       : "+ucountry.toUpperCase());
				System.out.println("--------------------------------");
				System.out.println("Confirm Your Password ");
				String cupassword = br.readLine();
				if(cupassword.equalsIgnoreCase(upassword)) {
					String ok = br.readLine();
					if(ok.equalsIgnoreCase("OK")) {
						System.out.println("Saved in Database");
						System.out.println("--------------------------------");
						System.out.println("Log-In");
						System.out.println("Enter your Name ");
						String name = br.readLine();
						System.out.println("Enter your Customer ID ");
						String cid = br.readLine();
						System.out.println("Enter Password");
						String password = br.readLine();	
						if((name.equalsIgnoreCase(fname.concat(lname)))&&password.equals(upassword)) {
							System.out.println("Done");
							System.out.println("--------------------------------");
							System.out.println("      Fill The Form :     ");
							System.out.println("--------------------------------");
							
							System.out.println("Select ");
							for(ShowClass sc : from.getAll()) {
								System.out.println(sc.getPlace());
							}
							System.out.print("From : ");
							String ufrom = br.readLine();
							
							System.out.println();
							
							System.out.println("Select ");
							for(ShowClass sc : too.getAll1()) {
								System.out.println(sc.getPlace());
							}
							System.out.print("To : ");
							String uto = br.readLine();
							
							System.out.println();
							System.out.println("------------------------------");
							for(Details d1 : dsc.getAllD()) {
								if((ufrom.equalsIgnoreCase(d1.getFromu()))&&(uto.equalsIgnoreCase(d1.getTou()))) {
									
									System.out.println("                              From : "+ d1.getFromu()+"       To : "+d1.getTou());
									System.out.println("Flight No.        Flight Name         ");
									for(InfoD df : obj.getAllDT()) {
										System.out.println( df.getTrainno()+"            "+df.getTrainname()+"               ");
									}
									System.out.println("Enter Flight name");
									String tname1 = br.readLine();
									System.out.println("S.No. ");
									int y = Integer.parseInt(br.readLine());
									InfoD df1 = obj.getOne(y-1);
									System.out.println("Flight Number is  "+df1.getTrainno());
									System.out.println("Flight Name is    "+df1.getTrainname());
									System.out.println("Select \n1.Economy Class \n2.Business Class");
									int xyz = Integer.parseInt(br.readLine());
									System.out.println("Enter Number of Passenger ");
									int passenger = Integer.parseInt(br.readLine());
									Ticket tt = be.getClassss(xyz);
									tt.getrate();
									double fair = tt.calculateFair(passenger);
									System.out.println("Wait Your Tickets Is Generating");
									System.out.println("--------------------------------------------------");
									System.out.println("               Ticket                             ");
									System.out.println(d);
									System.out.println("|        Customer ID   : "+unid);
									System.out.println("|        Name          : "+fname.concat(lname));
									System.out.println("|        Mobile No.    : "+ unumber);
									System.out.println("|        Age           : "+uage);
									System.out.println("|        Gender        : "+ugender);
									System.out.println("|        City          : "+ucity.toUpperCase());
									System.out.println("|        State         : "+ustate.toUpperCase());
									System.out.println("|        PIN           : "+upin);
									System.out.println("|        Country       : "+ucountry.toUpperCase());
									System.out.println("--------------------------------------------------");
									System.out.println("|        Flight Number is  "+df1.getTrainno());
									System.out.println("--------------------------------------------------");
									System.out.println("|  From : "+ d1.getFromu()+"       To : "+d1.getTou()+"       Number of Passenger : "+passenger+"         Flight Name :  "+df1.getTrainname());
									System.out.println("|                 Total Fair is " +fair);
									System.out.println("--------------------------------------------------");
									System.out.println("          Safe Journey       ");
								}
								else {
									;
								}
							}
					
						}
						else {
							System.out.println("Please Enter Valid Information");
						}
						
					}
					else {
						System.out.println("Please Enter OK to Confirm");
					}
				}
				else {
					System.out.println("Enter Your Coreect Password");
				}
			}
			else if(ch==3) {
				break;
			}
			else {
				System.out.println("Enter Correct Choice");
				}
			
			}
			}
			else if(chh==3) {
				break;
			}
		}
	}
}