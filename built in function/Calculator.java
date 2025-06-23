import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println("Result: " + add(num1, num2)); break;
            case 2: System.out.println("Result: " + subtract(num1, num2)); break;
            case 3: System.out.println("Result: " + multiply(num1, num2)); break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + divide(num1, num2));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
