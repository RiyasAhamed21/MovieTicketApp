package com.riyasahamed;

public class MovieManager {
	
	// Storing movie details
	static String[] movie = { "Karnan", "Master", "Sulthan" };
	
	public static String[] getMovieDetails() {
		return movie;
	}

	public static void displayMovieDetail() {

		// Display movie Details
		System.out.println("************Movies***********************");
		for (String name : movie) {
			System.out.println(name);
		}
		System.out.println("****************************************");

	}
}
