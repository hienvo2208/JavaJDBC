package com.vietjack.edu;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MyClass myclass;
	public static void main(String[] args) {
		myclass=new MyClass("Khoa 5");
		System.out.println("Chuong trinh quan ly sinh vien");
		printMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Nhap vao su lua chon cua ban");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				listStudent();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				deleteStudentById();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				searchStudent();
				break;
			case 6:
				printMenu();
				break;
			case 7:
				calculateAverageAge();
				break;
			case 8:
				flag = false;
				System.out.println("Chuong trinh thuc");
				break;
			default:
				System.out.println("Ban nhap sai");

			}

		}
	}
	public static void deleteStudentById(){
		System.out.println("Ham xoa sinh vien");
		System.out.println("Nhap id sinh vien can xoa");
		long id=scanner.nextLong();
		myclass.deleteStudent(id);
	}
	public static void listStudent(){
		if(myclass.getStudents().size()==0){
			System.out.println("Khong co sinh vien nao");
			return;
		}
		for(Student student: myclass.getStudents()){
			System.out.println(student);
		}
	}
	
	public static void modifyStudent(){
		
		System.out.println("nhap vao id can sua ");
		long id = scanner.nextLong();
		scanner.nextLine();
		
		for(int i = 0; i < myclass.getStudents().size();i++){
			if(myclass.getStudents().get(i).getId() == id){
				System.out.println("nhap vao ten can sua ");
				String name = scanner.nextLine();
				System.out.println("nhap vao tuoi can sua ");
				int age = scanner.nextInt();
				Student student = new Student(id,name,age);
				myclass.getStudents().set(i,student);
				
			}
			
		}
		
		System.out.println("nhap vao ten can ");
		
		
	}
		
	public static void calculateAverageAge(){
		System.out.println("Tuoi trung binh la "+myclass.getAverageAge());
	}
	public static void searchStudent(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id can tim");
		int id = scanner.nextInt();
		scanner.nextLine();
		Student student=myclass.searchStudent(id);
		if(student!=null){
			System.out.println(student);
		}else{
			System.out.println("Khong tim thay");
		}
	}
	
	
		
		
	
	public static void addStudent(){
		System.out.println("Ham them moi sinh vien");
		System.out.println("Nhap ten cua sinh vien");
		String name=scanner.nextLine();
		System.out.println("Nhap tuoi cua sinh vien");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Nhap ma cua sinh vien");
		long id=scanner.nextLong();
		scanner.nextLine();
		Student student=new Student(id, name, age);
		myclass.addStudent(student);
	}
	public static void printMenu() {
		System.out.println("1. Liet ke sinh vien");
		System.out.println("2. Them sinh vien");
		System.out.println("3. Xoa sinh vien");
		System.out.println("4. Sua ten sinh vien");
		System.out.println("5. Tim kiem sinh vien");
		System.out.println("6. In ra menu");
		System.out.println("7. Tinh tuoi trung binh");
		System.out.println("8. Thoat");
	}
	
}
