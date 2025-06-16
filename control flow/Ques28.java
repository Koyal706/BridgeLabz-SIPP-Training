import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        int serviceYears;

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        serviceYears = sc.nextInt();

        if (serviceYears > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
    }
}
