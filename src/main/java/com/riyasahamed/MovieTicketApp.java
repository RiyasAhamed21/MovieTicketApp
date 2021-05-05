package com.riyasahamed;

public class MovieTicketApp {

	public static void main(String[] args) {
		// Feature 1 : Login
		Long mobileNo =9345442250l; //stores mobile Number
		String password ="Riiyas@12"; // stores password
		// Validates the User Credentials 
		String valid = UserValidator.checkUser(mobileNo, password);
		System.out.println(valid); // Displays Status of Registration
		if(valid.equalsIgnoreCase("You are Succesfully Registered...")) {
		UserManager.addUser(mobileNo, password);
		String login=UserValidator.checkUserLogin(mobileNo, password);
		System.out.println(login);
		if(login.equalsIgnoreCase("Valid Credentials")) {
		// Feature 2 : Ticket Manager
		// Storing Ticket Details
		MovieManager.getMovieDetails();
		TicketManager.getSeatDetails();
		TicketManager.availableTickets();
		// Displays Ticket Details
		MovieManager.displayMovieDetail();
		TicketManager.displaySeatDetails();
		//Entering Movie Details
		String movieName = "Karnan";
		String seatType = "Platinum";
		int noOfTickets = 6;
		// Feature 3 : Validation
		// Validates Movie
		boolean validMovie = MovieValidator.checkMovie(movieName);
		// Checks availability of Tickets
		boolean validTickets = TicketValidator.checkTickets(movieName, noOfTickets);
		// Feature 4: Pricing
		if (validMovie && validTickets) {
			// calculates Base Price
			int basePrice = Pricing.calulateBasePrice(seatType, noOfTickets);
			// calculates price with GST
			float totalPrice = Pricing.totalPrice(basePrice, 8);
			// Displays Ticket Details
			TicketManager.displayDetails(movieName, seatType, noOfTickets);
			// Displays Price Details
			System.out.println("Base Price is :Rs. " + basePrice);
			System.out.println("Total Price is :Rs. " + totalPrice);
			System.out.println("Booking Successful.....");
		} else {
			System.out.println("Invalid Details Entered");
		}

	}
		}
		else {
			System.out.println("Invalid Login Credentials");
		}
		
		}
}
