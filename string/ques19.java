import java.util.Random;

public class Q19_StudentGrades {
    static String getGrade(double avg) {
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        if (avg >= 40) return "E";
        return "F";
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] marks = new int[5][3];
        double[] averages = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(41) + 60;
                total += marks[i][j];
            }
            averages[i] = total / 3.0;
            grades[i] = getGrade(averages[i]);
        }

        System.out.printf("%-8s%-10s%-10s%-10s%-10s%-8s\n", "Student", "Physics", "Chemistry", "Maths", "Average", "Grade");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-8s%-10d%-10d%-10d%-10.2f%-8s\n",
                "Student" + (i + 1), marks[i][0], marks[i][1], marks[i][2], averages[i], grades[i]);
        }
    }
}
