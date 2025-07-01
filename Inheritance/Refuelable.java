interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int speed, String model) {
        super(speed, model);
    }

    void charge() {
        System.out.println("Charging electric vehicle: " + model);
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int speed, String model) {
        super(speed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle: " + model);
    }
}
