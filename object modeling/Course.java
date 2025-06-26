class Course {
    String name;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enroll(Student s) {
        enrolledStudents.add(s);
        s.courses.add(this);
    }

    void showEnrolled() {
        System.out.println("Course: " + name);
        for (Student s : enrolledStudents) System.out.println(s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void viewCourses() {
        System.out.println(name + "'s courses:");
        for (Course c : courses) System.out.println(c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}
