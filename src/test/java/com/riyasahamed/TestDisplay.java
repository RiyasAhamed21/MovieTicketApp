package com.riyasahamed;

public class TestDisplay {

	/**
	 * This Method checks whether the methods displays the ticket details or not
	 */

	public static void main(String[] args) {
		TicketManager.displaySeatDetails(); // Displays Seat Types
		TicketManager.displayMovieDetail(); // Displays Movie Details
		String movieName = "Karnan";
		String seatType = "Platinum";
		int noOfTickets = 6;
		Display.displayDetails(movieName, seatType, noOfTickets);

	}
}
