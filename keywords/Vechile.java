class Vehicle {
    static double registrationFee = 5000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}
