package com.deloitte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieBooking {
	
	public static void main(String[] args) {
		int input; 
		
		System.out.println("Enter 1 to continue and 0 to stop.");
		Scanner sc = new Scanner(System.in); 
		input = sc.nextInt();	
		
		if(input==1) {
		List<MovieClassMain> MovieList = new ArrayList<>();
		System.out.println("Enter the id, name, showdate, showtime and status of the movie");
		int id = sc.nextInt();
		String name = sc.nextLine();
		String showDate = sc.nextLine();
		Double showTime = sc.nextDouble();
		Boolean status = sc.nextBoolean();
		
		MovieList.add(new MovieClassMain(id,name,showDate,showTime,status));
	
	}
		sc.close(); 

}
}

