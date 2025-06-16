import java.util.Scanner;
public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();
        double total = salary + bonus;
        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f\n", salary, bonus, total);
    }
}