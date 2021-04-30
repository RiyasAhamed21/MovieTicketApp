package com.riyasahamed;

import java.util.Set;

public class TicketValidator {
	
	/** This Method Checks the Movie Name
	 * @param movieName
	 * @return Validity of Movie Name
	 */
	public static boolean checkMovie(String movieName) {
		TicketManager.availableTickets();
		Set<String> movie = TicketManager.ticket.keySet();
		boolean valid = false;
		for (String name : movie) {
			if (movieName.equalsIgnoreCase(name)) {
				valid = true;
			}
		}
		return valid;
	}

	/** This Method Checks the Availability of Tickets
	 * @param movieName
	 * @param noOfTickets
	 * @return Availability of Tickets
	 */
	public static boolean checkTickets(String movieName, int noOfTickets) {
		TicketManager.availableTickets();
		int availableTickets = TicketManager.ticket.get(movieName);
		boolean valid = true;
		if (noOfTickets > availableTickets) {
			return false;
		}
		return valid;
	}

}
