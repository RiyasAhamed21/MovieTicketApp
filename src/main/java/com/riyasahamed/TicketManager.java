package com.riyasahamed;

import java.util.HashMap;

public class TicketManager {

	// Storing movie details
	static String[] movie = { "Karnan", "Master", "Sulthan" };
	// Storing Seat details
	static String[] seat = { "Silver- Rs. 60", "Gold- Rs.120", "Platinum- Rs.190" };

	static HashMap<String, Integer> ticket = new HashMap<String, Integer>();

	public static String[] getMovieDetails() {
		return movie;
	}

	public static String[] getSeatDetails() {
		return seat;
	}

	public static void availableTickets() {
		// Storing No of Tickets 
		ticket.put("Karnan", 10);
		ticket.put("Sulthan", 20);
		ticket.put("Master", 30);
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
}