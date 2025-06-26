class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department2 {
    String name;

    Department2(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    List<Department2> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department2 d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showAll() {
        System.out.println("University: " + name);
        for (Department2 d : departments) d.show();
        for (Faculty f : faculties) f.show();
    }
}
