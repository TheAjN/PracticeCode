package com.ajn.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/*
 Implementing Comparable means "I can compare myself with another object." 
 This is typically useful when there's a single natural default comparison.

Implementing Comparator means "I can compare two other objects." 
This is typically useful when there are multiple ways of comparing two instances of a same type - 
e.g. you could compare people by age, name etc.
  
 */

public class Theatre {

	private final String name;

//	private Collection<Seat> seats;
	private List<Seat> seats;

	static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() { // Creating a comparator class
		// within an existing class
		@Override
		public int compare(Seat seat1, Seat seat2) {
// TODO Auto-generated method stub
			if (seat1.getPrice() > seat2.getPrice()) {
				return 1;
			} else if (seat1.getPrice() < seat2.getPrice()) {
				return -1;
			} else {
				return 0;
			}
		}
	};

//	static {
//		PRICE_ORDER = new Comparator<Seat>() { // Creating a comparator class
//												// within an existing class
//			@Override
//			public int compare(Seat seat1, Seat seat2) {
//				// TODO Auto-generated method stub
//				if (seat1.getPrice() > seat2.getPrice()) {
//					return 1;
//				} else if (seat1.getPrice() < seat2.getPrice()) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//		};
//	}

	public Theatre(String name, int numRows, int seatsPerRow) {
		this.name = name;
		seats = new ArrayList<>();
		// seats= new LinkedList<>();
		// seats= new HashSet<>();
		// seats= new LinkedHashSet<>();
		// seats= new TreeSet<>(); //

		int lastRow = 'A' + (numRows - 1);

		for (char row = 'A'; row <= lastRow; row++) {
			for (int i = 1; i <= seatsPerRow; i++) {
				double price = 12.0; // normal seats

				if ((row < 'D') && (i >= 4 && i <= 9)) { // premium seats
					price = 14.0;
				} else if (row >= 'D' || (i < 4 || i > 9)) { // seats on the edge or back of the theatre
					price = 7.0;
				}

				Seat seat = new Seat(row + String.format("%02d", i), price);
				seats.add(seat);
			}
		}

	}

	public Collection<Seat> getSeats() {
		return seats;
	}

	public String getName() {
		return name;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber, 0);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

		// int foundSeat = binarySearch(requestedSeat);
		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("Seat " + seatNumber + " is not found");
			return false;
		}

//		if(findSeat(seatNumber)!= null) {
//			requestedSeat = findSeat(seatNumber);
//		}else {
//			System.out.println("There is no seat" + seatNumber);
//			return false;
//		}

		// return requestedSeat.reserve();

	}

//	private int binarySearch(Seat seat) {
//		int low = 0;
//		int high = seats.size() -1;
//		
//		while(low<=high) {
//			System.out.print(".");
//			int mid = (low+high)/2;
//			int cmp = seats.get(mid).compareTo(seat);
//			
//			if(cmp<0) {
//				low = mid + 1;
//			}else if(cmp>0) {
//				high= mid - 1;
//			}else {
//				return mid;
//			}
//			
//		}
//		
//		return -1;
//		
//	}
//	private Seat findSeat(String seatNumber) {
//		for (Seat i: seats) {
//			System.out.print(".");
//			if (i.getSeatNumber().equals(seatNumber)) {
//				Seat seat = i;
//				return seat;
//			}
//		}
//		
//		return null;
//	}

	public void getSeat() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

	public class Seat implements Comparable<Seat> {

		private final String seatNumber;
		private double price;
		private boolean reserved = false;

		public Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}

		String getSeatNumber() {
			return seatNumber;
		}

		public double getPrice() {
			return price;
		}

		public boolean reserve() {

			if (!this.reserved) {
				this.reserved = true;
				System.out.println("\nSeat " + seatNumber + " is reserved");
				return true;
			}

			return false;
		}

		public boolean cancel() {

			if (this.reserved) {
				this.reserved = false;
				System.out.println("\nSeat " + seatNumber + " is cancelled");
				return true;
			}

			return false;
		}

		@Override
		public int compareTo(Seat seat) {
			// TODO Auto-generated method stub
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

	}

}
