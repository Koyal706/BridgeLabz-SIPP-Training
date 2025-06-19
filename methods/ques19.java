import java.util.Scanner;

public class ques19 {

    // Method to calculate BMI and update the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places
        }
    }

    // Method to get BMI status based on BMI value
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    // Method to display data
    public static void displayData(double[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < data.length; i++) {
            String status = getBMIStatus(data[i][2]);
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", data[i][0], data[i][1], data[i][2], status);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] peopleData = new double[10][3]; // 0 - weight, 1 - height, 2 - BMI

        // Input weights and heights
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            peopleData[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            peopleData[i][1] = sc.nextDouble();
        }

        calculateBMI(peopleData);
        displayData(peopleData);
    }
}
