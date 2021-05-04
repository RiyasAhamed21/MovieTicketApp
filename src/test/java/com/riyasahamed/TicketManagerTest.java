package com.riyasahamed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketManagerTest {

	/**
	 * This Method checks the input of movie details.
	 */
	@Test
	public void testMovie() {
		String[] movieDetails = MovieManager.getMovieDetails();
		assertEquals(3, movieDetails.length);
	}

	/**
	 * This Method checks the input of Seat details.
	 */
	@Test
	public void testSeatType() {
		String[] seatType = TicketManager.getSeatDetails();
		assertEquals(3, seatType.length);
	}

}
