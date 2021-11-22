package com.vietjack.edu;


import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
	private String name;
	private ArrayList<Student> students=new ArrayList<Student>();
	public MyClass(String name){
		this.name=name;
	}
	public void addStudent(Student student){
		students.add(student);
	}
	public void modifyStudent(int index,String name){
		Student student=students.get(index);
		student.setName(name);
		students.set(index, student);
	}
	public void deleteStudent(int index){
		students.remove(index);
	}
	public void deleteStudent(long id){
		int index=-1;
		for(int i=0;i<students.size();i++){
			Student student=students.get(i);
			if(student.getId()==id){
				index=i;
			}			
		}
		if(index>=0){
			deleteStudent(index);
			System.out.println("Da xoa thanh cong 1 doi tuong");
		}else{
			System.out.println("Khong co sinh vien nao voi ma tren");
		}
	}
	public Student searchStudent(String name){
		for(Student student:students){
			if(student.getName().equalsIgnoreCase(name)){
				return student;
			}
		}
		return null;
	}
	public Student searchStudent(long id){
		for(Student student:students){
			if(student.getId()==id){
				return student;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public double getAverageAge(){
		int total=0;
		for(Student student: students){
			total+=student.getAge();
		}
		return total/(students.size());
		
	}
	
	
}
