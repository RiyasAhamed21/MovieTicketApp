package com.riyasahamed;

import java.util.Set;

public class MovieValidator {
	
	/** This Method Checks the Movie Name
	 * @param movieName
	 * @return Validity of Movie Name
	 */
	public static boolean checkMovie(String movieName) {
		TicketManager.availableTickets();
		Set<String> movies = TicketManager.tickets.keySet();
		boolean valid = false;
		for (String name : movies) {
			if (movieName.equalsIgnoreCase(name)) {
				valid = true;
				break;
			}
		}
		return valid;
	}

}
