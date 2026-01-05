package com.kodewala.trainticketbooking;

public class NormalUser implements TicketBooking {
 public static final int MAX_PASSANGER = 6;
	@Override
	public void searchTrain(String trainNumber, String startLocation, String endLocation) {
	System.out.println("Searching for the train with "+trainNumber+"journey started from"+ startLocation +" to "+ endLocation);
		
	}

	@Override
	public String bookTrainTicket(String trainNumber, int numberOfPassangers) {
		if (numberOfPassangers > MAX_PASSANGER) {
			System.out.println("Can not be more than 6 passangers .");
		}
		else {
			System.out.println("The current train number is "+trainNumber+" and the number of passangers are"+numberOfPassangers);
		}
		return null;
	
	}

	@Override
	public void cancelTrainTicket(String trainNumber) {
	 System.out.println("Canceling the ticket of the train "+trainNumber);
		
	}

}
