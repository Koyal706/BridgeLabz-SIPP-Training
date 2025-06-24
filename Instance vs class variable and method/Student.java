class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    public void showDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name);
        // Can't access CGPA directly here as it is private
    }
}
