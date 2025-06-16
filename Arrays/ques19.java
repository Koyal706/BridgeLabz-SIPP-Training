import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter customer number: ");
        int number = sc.nextInt();
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double rate;
        if (units <= 100) rate = 2.0;
        else if (units <= 300) rate = 3.0;
        else rate = 5.0;

        double bill = units * rate;

        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Number: " + number);
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate per Unit: ₹" + rate);
        System.out.println("Total Bill: ₹" + bill);
    }
}
