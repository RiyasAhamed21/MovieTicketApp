package com.riyasahamed;

public class Display {
	/* 
	 * This Method Displays the Booking Details */
	public static void displayDetails(String movieName, String seatType, int noOfTickets) {
		System.out.println("******************Ticket Details************************");
		System.out.println("Movie : " + movieName);
		System.out.println("Seat Type :" + seatType);
		System.out.println("No Of Tickets : " + noOfTickets);
	}

}
