package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class PricingTest {

	@Test
	// Check Base Price for Platinum Seat Type 
	public void testBasePriceForPlatinum() {
		String seatType = "Platinum";
		int noOfTickets = 5;
		int basePrice = Pricing.calulateBasePrice(seatType, noOfTickets);
		assertEquals(950, basePrice);
	}

	@Test
	// Check Base Price for Silver Seat Type 
	public void testBasePriceForSilver() {
		String seatType = "Silver";
		int noOfTickets = 5;
		int basePrice = Pricing.calulateBasePrice(seatType, noOfTickets);
		assertEquals(300, basePrice);
	}

	@Test
	// Check Base Price for Gold Seat Type 
	public void testBasePriceForGold() {
		String seatType = "Gold";
		int noOfTickets = 5;
		int basePrice = Pricing.calulateBasePrice(seatType, noOfTickets);
		assertEquals(600, basePrice);
	}


}
