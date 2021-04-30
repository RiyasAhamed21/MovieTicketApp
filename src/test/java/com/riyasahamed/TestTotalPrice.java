package com.riyasahamed;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTotalPrice { 

	@Test
	// Checks Total Price
	public void testTotalPrice() {
		float gst=8;
		int basePrice=100;
		float totalPrice=Pricing.totalPrice(basePrice, gst);
		assertEquals(108,totalPrice,2);
	}

}
