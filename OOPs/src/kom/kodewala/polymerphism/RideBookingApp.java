package kom.kodewala.polymerphism;

class Ride {
	void calculateFare () {
		System.out.println("Calculate fare for a generic ride ");
	}
}

class BikeRide extends Ride {
	@Override
	void calculateFare () {
		System.out.println("Fare for Bike Ride : 50");
	}
}
class CarRide extends  Ride {
	@Override
	void calculateFare () {
		System.out.println("Fare for car ride : 120");
	}
}
class AutoRide extends Ride {
	@Override
	void calculateFare () {
		System.out.println("Fare for Auto ride:80");
	}
}
public class RideBookingApp {

	public static void main(String[] args) {
		//Parent reference to child object
		Ride ride;
		
		ride = new BikeRide();
		ride.calculateFare();
		
		ride = new CarRide ();
		ride.calculateFare();
		
		ride = new AutoRide();
		ride.calculateFare();

	}

}
/*
The reference decides what you can call
The object decides what actually runs .



Runtime polymorphism means the method that runs is decided by the object, not by the reference.

calculateFare () is overridden, java deicides overidden methods at run time



















*/