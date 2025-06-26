class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course2 {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course2(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
    }

    void enroll(Student s) {
        students.add(s);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course2 c) {
        c.enroll(this);
    }
}
