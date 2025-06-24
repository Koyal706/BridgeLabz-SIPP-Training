class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int id, String dept, double sal) {
        this.employeeID = id;
        this.department = dept;
        this.salary = sal;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    public void showManagerDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department);
        // Cannot access salary directly
    }
}
