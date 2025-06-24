class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    public Vehicle(String owner, String type) {
        this.ownerName = owner;
        this.vehicleType = type;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
