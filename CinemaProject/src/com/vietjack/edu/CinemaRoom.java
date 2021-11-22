package com.vietjack.edu;

import java.util.ArrayList;

public class CinemaRoom {
	private String name;
	private ArrayList<Seat> seats = new ArrayList<Seat>();

	public CinemaRoom(String name, int numRow, int seatPerrow) {
		this.name = name;
		int lastRow = 'A' + numRow - 1;
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatPerrow; seatNum++) {
				if (row == 'C' || row == 'D' || row == 'E') {
					Seat seat = new Seat(row + String.format("%02d", seatNum), 160);
					seats.add(seat);
				}
				else{
					Seat seat = new Seat(row + String.format("%02d", seatNum), 80);
					seats.add(seat);
				}
			}
		}
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestSeat = null;
		for (Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				requestSeat = seat;
				break;
			}
		}
		if (requestSeat == null) {
			System.out.println("Ghe ban dat khong ton tai");
			return false;
		}
		return requestSeat.reserveSeat();
	}
	
	public double getPrice(String seatNumber){
		Seat requestSeat = null;
		for (Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				requestSeat = seat;
				break;
			}
		}
		if (requestSeat == null) {
			System.out.println("Ghe ban dat khong ton tai");
		}
		return requestSeat.getPrice();
	}

	public void printSeats() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

	public void printSeatReseved() {

		for (Seat seat : seats) {
			if (seat.reserveSeat() == true) {
				System.out.println(seat);
			}

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

}
