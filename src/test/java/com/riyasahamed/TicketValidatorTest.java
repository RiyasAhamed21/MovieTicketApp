package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketValidatorTest {

	@Test
	public void testTickets() {
		// Number of Tickets more than the available Tickets
		String movieName = "Master";
		int noOfTickets = 40;
		boolean valid = TicketValidator.checkTickets(movieName, noOfTickets);
		assertFalse(valid);
	}

	@Test
	public void testWithAvailableTickets() {
		// Number of tickets less than the available tickets
		String movieName = "Master";
		int noOfTickets = 5;
		boolean valid = TicketValidator.checkTickets(movieName, noOfTickets);
		assertTrue(valid);
	}

	@Test
	public void testValidMovieName() {
		String movieName = "Master";
		boolean valid = TicketValidator.checkMovie(movieName);
		assertTrue(valid);
	}

	@Test
	public void testInvalidMovieName() {
		String movieName = "Asuran";
		boolean valid = TicketValidator.checkMovie(movieName);
		assertFalse(valid);
	}
}
