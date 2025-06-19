import java.util.*;

public class ques29 {
    public static void main(String[] args) {
        int[][] employees = generateSalariesAndService(10);
        double[][] updated = calculateBonuses(employees);
        displayBonusReport(employees, updated);
    }

    public static int[][] generateSalariesAndService(int n) {
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // salary (5-digit)
            data[i][1] = (int)(Math.random() * 11); // service years (0 to 10)
        }
        return data;
    }

    public static double[][] calculateBonuses(int[][] employees) {
        double[][] result = new double[employees.length][2]; // [new salary, bonus]
        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayBonusReport(int[][] oldData, double[][] newData) {
        System.out.printf("%-5s %-10s %-10s %-10s %-15s %-15s%n", 
            "Emp", "Salary", "Years", "Bonus", "New Salary", "Bonus %");
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        for (int i = 0; i < oldData.length; i++) {
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%-5d %-10d %-10d %-10.2f %-15.2f %-15.2f%n",
                (i + 1), oldData[i][0], oldData[i][1],
                newData[i][1], newData[i][0],
                (newData[i][1] * 100) / oldData[i][0]);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f, Total New Salary: %.2f, Total Bonus: %.2f%n",
            totalOld, totalNew, totalBonus);
    }
}
