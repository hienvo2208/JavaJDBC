package com.vietjack.edu;


public class Student {
	private long id;
	private String name;
	private int age;
	private Subject math;
	private Subject physics;
	public static final double BASE_FEE=2000;
	
	public Student() {
		super();
	}
	public Student(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void inputSubject(){
		math=new Subject("Math", 0.7,false);
		physics=new Subject("Physics", 0.3,true);
		math.inputMark();
		physics.inputMark();
	}
	public void showSubject(){
		System.out.println(math.toString());
		System.out.println(physics.toString());
	}
	//tinh hoc phi sinh vien
	public double calculateFee(){
		double totalFee=0;
		totalFee+=BASE_FEE*(math.getRatio()*math.getRatioFee()+physics.getRatio()*physics.getRatioFee());
		return totalFee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "VietJackEdu Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
