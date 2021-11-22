package com.vietjack.edu;

public class Main {
	public static void main(String[] args) {
		// CDE x2 , hang khac 80
		CinemaRoom cinemaRoom = new CinemaRoom("CGV01", 15, 12);
		//cinemaRoom.printSeats();
		if (cinemaRoom.reserveSeat("A03")) {
			System.out.println("Tra tien cho viec dat ghe "+ cinemaRoom.getPrice("A03"));
		} else {
			System.out.println("Ghe da duoc dat");
		}
		System.out.println("-------------");
		if (cinemaRoom.reserveSeat("A03")) {
			System.out.println("Tra tien cho viec dat ghe" + cinemaRoom.getPrice("A03"));
		} else {
			System.out.println("Ghe da duoc dat");
		}
		System.out.println("-------------");

		if (cinemaRoom.reserveSeat("D04")) {
			System.out.println("Tra tien cho viec dat ghe "+ cinemaRoom.getPrice("D04"));
		} else {
			System.out.println("Ghe da duoc dat");
		}
		//cinemaRoom.printSeatReseved();
	}

}
