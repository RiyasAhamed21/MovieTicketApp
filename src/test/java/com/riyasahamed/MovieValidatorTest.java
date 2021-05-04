package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieValidatorTest {

	@Test
	public void testValidMovieName() {
		//Test with Valid Movie Name
		String movieName = "Master";
		boolean valid = MovieValidator.checkMovie(movieName);
		assertTrue(valid);
	}

	@Test
	public void testInvalidMovieName() {
		//Test with Invalid Movie Name
		String movieName = "Asuran";
		boolean valid = MovieValidator.checkMovie(movieName);
		assertFalse(valid);
	}
}
