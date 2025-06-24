class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Academy";

    public Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
