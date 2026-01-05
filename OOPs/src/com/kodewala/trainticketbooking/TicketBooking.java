package com.kodewala.trainticketbooking;

public interface TicketBooking {
	
	void searchTrain(String trainNumber, String startLocation , String endLocation);
	String bookTrainTicket(String trainNumber, int numberOfPassangers);
	
	void cancelTrainTicket(String trainNumber);
	
	// Normal user , Agents 

}
