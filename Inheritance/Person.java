class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student in grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String dept) {
        super(name, age);
        this.department = dept;
    }

    void displayRole() {
        System.out.println("Staff from " + department);
    }
}
