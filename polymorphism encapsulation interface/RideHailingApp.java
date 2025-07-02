interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLoc);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: ₹" + ratePerKm);
    }
}

class RideCar extends RideVehicle implements GPS {
    private String location;

    public RideCar(String id, String driver, double rate) {
        super(id, driver, rate);
        location = "Start";
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // Base fare
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

class RideBike extends RideVehicle implements GPS {
    private String location;

    public RideBike(String id, String driver, double rate) {
        super(id, driver, rate);
        location = "Start";
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        RideVehicle[] rides = {
            new RideCar("CAR123", "Alex", 12.5),
            new RideBike("BIKE456", "Sam", 8)
        };

        for (RideVehicle ride : rides) {
            ride.getVehicleDetails();
            ((GPS)ride).updateLocation("Downtown");
            System.out.println("Current Location: " + ((GPS)ride).getCurrentLocation());
            System.out.println("Fare for 10km: ₹" + ride.calculateFare(10));
            System.out.println("-------------------------");
        }
    }
}
