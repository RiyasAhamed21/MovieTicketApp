package com.riyasahamed;

public class Pricing {

	/**This Method Calculates the Base Price for the Movie
	 * @param seatType
	 * @param noOfTickets
	 * @return basePrice
	 */
	public static int calulateBasePrice(String seatType, int noOfTickets) {
		int basePrice = 0;
		if (seatType.equalsIgnoreCase("Silver")) {
			basePrice = noOfTickets * 60;
		} else if (seatType.equalsIgnoreCase("Gold")) {
			basePrice = noOfTickets * 120;
		} else if (seatType.equalsIgnoreCase("Platinum")) {
			basePrice = noOfTickets * 190;
		}
		return basePrice;
	}
	
	/** This Method Calculates the Tax and gives the Total Price
	 * @param basePrice
	 * @param gst
	 * @return Total Price
	 */
	public static float totalPrice(int basePrice, float gst) {
		float totalPrice=0;
		totalPrice=basePrice+(basePrice*(gst/100));
		return totalPrice;
	}
}
