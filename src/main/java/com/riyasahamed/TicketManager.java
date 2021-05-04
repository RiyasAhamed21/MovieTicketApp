package com.riyasahamed;

import java.util.HashMap;

public class TicketManager {

	// Storing movie details
	static String[] movie = { "Karnan", "Master", "Sulthan" };
	// Storing Seat details
	static String[] seat = { "Silver- Rs. 60", "Gold- Rs.120", "Platinum- Rs.190" };

	static HashMap<String, Integer> tickets = new HashMap<String, Integer>();

	public static String[] getMovieDetails() {
		return movie;
	}

	public static String[] getSeatDetails() {
		return seat;
	}

	public static void availableTickets() {
		// Storing No of Tickets 
		tickets.put("Karnan", 10);
		tickets.put("Sulthan", 20);
		tickets.put("Master", 30);
	}

	public static void displayMovieDetail() {

		// Display movie Details
		System.out.println("************Movies***********************");
		for (String name : movie) {
			System.out.println(name);
		}
		System.out.println("****************************************");

	}

	public static void displaySeatDetails() {
		// Displaying Seat Details
		System.out.println("************Seat Type***********************");
		for (String type : seat) {
			System.out.println(type);
		}
		System.out.println("****************************************");
	}
	
	/* 
	 * This Method Displays the Booking Details */
	public static void displayDetails(String movieName, String seatType, int noOfTickets) {
		System.out.println("******************Ticket Details************************");
		System.out.println("Movie : " + movieName);
		System.out.println("Seat Type :" + seatType);
		System.out.println("No Of Tickets : " + noOfTickets);
	}
}