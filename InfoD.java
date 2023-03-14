package com.airline;

public class InfoD {
	private int trainno;
	private String trainname;
	public InfoD(int trainno, String trainname) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	
}
