// Department Interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
