package com.kodewala.trainticketbooking;

public class Driver {

	public static void main(String[] args) {
		TicketBooking booking;

        System.out.println("This is a Normal User");
      
        booking = new NormalUser();
        booking.searchTrain("897484", "Bhubaneswar", "Banglore");
        booking.bookTrainTicket("897484", 4);
        booking.cancelTrainTicket("897484");
        

        System.out.println("This is a Agent");
        booking = new Agents();
        booking.searchTrain("989999", "Mumbai", "Bangalore");
        booking.bookTrainTicket("67890", 7);   
        booking.cancelTrainTicket("67890");
	}

}
