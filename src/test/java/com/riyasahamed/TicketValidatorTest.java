package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketValidatorTest {

	@Test
	public void testTickets() {	
		String movieName="Master";
		int noOfTickets=20;
		//TicketManager.ticketDetails();
		boolean valid=TicketValidator.checkTickets(movieName, noOfTickets);
		assertEquals(false,valid);
	}
	
	@Test
	public void testTicketsAvailable() {	
		String movieName="Master";
		int noOfTickets=5;
		//TicketManager.ticketDetails();
		boolean valid=TicketValidator.checkTickets(movieName, noOfTickets);
		assertEquals(true,valid);
	}
	
	@Test
	public void testMovieName() {	
		String movieName="Master";
		boolean valid=TicketValidator.checkMovie(movieName);
		assertEquals(true,valid);
	}
	
	@Test
	public void testMovieName2() {	
		String movieName="Asuran";
		boolean valid=TicketValidator.checkMovie(movieName);
		assertEquals(false,valid);
	}
}
