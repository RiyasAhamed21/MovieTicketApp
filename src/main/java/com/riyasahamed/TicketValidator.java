package com.riyasahamed;

public class TicketValidator {

	/**
	 * This Method Checks the Availability of Tickets
	 * 
	 * @param movieName
	 * @param noOfTickets
	 * @return Availability of Tickets
	 */
	public static boolean checkTickets(String movieName, int noOfTickets) {
		TicketManager.availableTickets();
		int availableTickets = TicketManager.tickets.get(movieName);
		boolean valid = true;
		if (noOfTickets > availableTickets) {
			valid = false;
		}
		return valid;
	}

}
