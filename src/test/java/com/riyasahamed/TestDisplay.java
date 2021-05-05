package com.riyasahamed;

import org.junit.Test;

public class TestDisplay {

	/**
	 * This Method checks whether the methods displays the ticket details or not
	 */
	@Test
	public void test() {
		TicketManager.displaySeatDetails(); // Displays Seat Types
		MovieManager.displayMovieDetail(); // Displays Movie Details
		String movieName = "Karnan";
		String seatType = "Platinum";
		int noOfTickets = 6;
		TicketManager.displayDetails(movieName, seatType, noOfTickets); // Displays Ticket Details..
	}

}
