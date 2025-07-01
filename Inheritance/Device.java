class Device {
    String deviceId;
    String status;

    Device(String id, String status) {
        this.deviceId = id;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String id, String status, double temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting);
    }
}
