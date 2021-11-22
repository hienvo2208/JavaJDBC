package com.vietjack.edu;

import java.util.Scanner;

public class Subject {
	private String name;
	private double mark;
	private double ratio;
	private boolean isPractice;
	
	
	public Subject() {
		super();
	}
	
	public Subject(String name, double ratio) {
		super();
		this.name = name;
		this.ratio = ratio;
	}
	public Subject(String name, double ratio,boolean isPractice) {
		this.name = name;
		this.ratio = ratio;
		this.isPractice=isPractice;
	}
	public Subject(String name, double mark, double ratio,boolean isPractice) {
		super();
		this.name = name;
		this.mark = mark;
		this.ratio = ratio;
		this.isPractice=isPractice;
	}
	public Subject(String name, double mark, double ratio) {
		super();
		this.name = name;
		this.mark = mark;
		this.ratio = ratio;
	}
	public double getRatioFee(){
		if(this.isPractice){
			return 2.0;
		}else{
			return 1.0;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
	
	
	public boolean isPractice() {
		return isPractice;
	}

	public void setPractice(boolean isPractice) {
		this.isPractice = isPractice;
	}

	public void inputMark(){
		System.out.println("Nhap diem mon hoc "+this.getName());
		Scanner scanner = new Scanner(System.in);
		double mark=scanner.nextDouble();
		scanner.nextLine();
		this.setMark(mark);
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", mark=" + mark + ", ratio=" + ratio + ", isPractice=" + isPractice + "]";
	}
	
	
}
