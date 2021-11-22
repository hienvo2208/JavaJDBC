package com.vietjack;

public class BankUtils {
	//tinh phan tram lai ngan
	public static double getInterestRatePerYear(int day){
		if(day<30){
			return 0.1;
		}else if(day>=30&& day<365){
			return 5.5;
		}else{
			return 7;
		}		
	}
}
