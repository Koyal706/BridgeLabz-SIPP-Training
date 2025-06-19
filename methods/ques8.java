import java.util.Scanner;
public class ques8 {
    public static double numberOfRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000.0 / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Rounds needed: " + numberOfRounds(a, b, c));
    }
}