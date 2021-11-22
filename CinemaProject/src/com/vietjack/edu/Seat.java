package com.vietjack.edu;

public class Seat {
	private String seatNumber;
	private boolean reserved;
	private double price;
	
	public boolean reserveSeat(){
		if(!this.reserved){
			this.reserved=true;
			System.out.println("Ghe :"+seatNumber+ " da duoc dat");
			return true;
		}else{
			return false;
		}
	}
	
	public Seat(String seatNumber, boolean reserved, double price) {
		super();
		this.seatNumber = seatNumber;
		this.reserved = reserved;
		this.price=price;
	}
	public Seat(String seatNumber, double price) {
		super();
		this.seatNumber = seatNumber;
		this.reserved = false;
		this.price=price;
	}
	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
		this.reserved = false;
	}
	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Seat [seatNumber=" + seatNumber + ", reserved=" + reserved + "]";
	}

}
