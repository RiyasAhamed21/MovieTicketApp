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
		assertEquals(false, valid);
	}

	@Test
	public void testTicketsAvailable() {
		// Number of tickets less than the available tickets
		String movieName = "Master";
		int noOfTickets = 5;
		boolean valid = TicketValidator.checkTickets(movieName, noOfTickets);
		assertEquals(true, valid);
	}

	@Test
	public void testValidMovieName() {
		String movieName = "Master";
		boolean valid = TicketValidator.checkMovie(movieName);
		assertEquals(true, valid);
	}

	@Test
	public void testInvalidMovieName() {
		String movieName = "Asuran";
		boolean valid = TicketValidator.checkMovie(movieName);
		assertEquals(false, valid);
	}
}
