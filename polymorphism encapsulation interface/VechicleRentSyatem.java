interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayVehicle() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate/day: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Car insurance is ₹1000";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 300;
    }

    public String getInsuranceDetails() {
        return "Bike insurance is ₹300";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500;
    }

    public double calculateInsurance() {
        return 1500;
    }

    public String getInsuranceDetails() {
        return "Truck insurance is ₹1500";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("KA01AB1234", 1500),
            new Bike("KA05XY5432", 500),
            new Truck("KA09ZZ8888", 2500)
        };

        for (Vehicle v : vehicles) {
            v.displayVehicle();
            System.out.println("Rental Cost (3 days): ₹" + v.calculateRentalCost(3));
            System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println("--------------------------");
        }
    }
}
