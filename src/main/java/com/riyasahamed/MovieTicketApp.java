package com.riyasahamed;

public class MovieTicketApp {

	public static void main(String[] args) {
		// Feature 1 : Login
		String mobileNo = User.getMobileNo(); // Stores mobile number
		String password = User.getPassword(); // stores password
		// Validates the User Credentials
		String valid = User.checkLogin(mobileNo, password);
		System.out.println(valid); // Displays Status of Login
		// Feature 2 : Ticket Manager
		// Storing Ticket Details
		TicketManager.getMovieDetails();
		TicketManager.getSeatDetails();
		TicketManager.availableTickets();
		// Displays Ticket Details
		TicketManager.displayMovieDetail();
		TicketManager.displaySeatDetails();
		String movieName = "Karnan";
		String seatType = "Platinum";
		int noOfTickets = 6;
		// Feature 3 : Validation
		// Validates Movie
		boolean validMovie = TicketValidator.checkMovie(movieName);
		// Checks availability of Tickets
		boolean validTickets = TicketValidator.checkTickets(movieName, noOfTickets);
		// Feature 4: Pricing
		if (validMovie && validTickets) {
			// Displays Ticket Details
			Display.displayDetails(movieName, seatType, noOfTickets);
			// calculates Base Price
			int basePrice = Pricing.calulateBasePrice(seatType, noOfTickets);
			// calculates price with GST
			float totalPrice = Pricing.totalPrice(basePrice, 8);
			// Displays Price Details
			System.out.println("Base Price is :Rs. " + basePrice);
			System.out.println("Total Price is :Rs. " + totalPrice);
			System.out.println("Booking Successful.....");
		} else {
			System.out.println("Invalid Details Entered");
		}

	}

}
