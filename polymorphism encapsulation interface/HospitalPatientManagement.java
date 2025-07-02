interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private String record;

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000; // Fixed stay charge
    }

    public void addRecord(String diagnosis) {
        record = diagnosis;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + record);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String record;

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 1000;
    }

    public void addRecord(String diagnosis) {
        record = diagnosis;
    }

    public void viewRecords() {
        System.out.println("Diagnosis: " + record);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "John", 35),
            new OutPatient(2, "Lisa", 28)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            ((MedicalRecord)p).addRecord("Flu");
            ((MedicalRecord)p).viewRecords();
            System.out.println("Bill: ₹" + p.calculateBill());
            System.out.println("--------------------");
        }
    }
}
