package kom.kodewala.inheritance;

class Vehicle {
    double speed;

    Vehicle(double speed) {
        this.speed = speed;
    }

    public void showSpeed() {
        System.out.println("The speed of the Vehicle is : " + speed + " km/h");
    }
}

class Car extends Vehicle {
    double fuelEfficiency; 
    double distance;       // w
    

    Car(double speed, double fuelEfficiency, double distance) {
        super(speed);
        this.fuelEfficiency = fuelEfficiency;
        this.distance = distance;
    }

    public void calculateFuelNeeded() {
        double fuelNeed = distance / fuelEfficiency;
        System.out.println("Fuel needed for " + distance + " km : " + fuelNeed + " liters");
    }
}

public class Driver {
    public static void main(String[] args) {

        Car c = new Car(80, 15, 300);  // speed, efficiency, distance

        c.showSpeed();
        c.calculateFuelNeeded();
    }
}
