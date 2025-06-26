class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting Patient " + p.name);
        p.addDoctor(this);
    }
}

class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }
}
