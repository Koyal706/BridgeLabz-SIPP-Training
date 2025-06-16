import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        double feet = inches / 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", cm, feet, inches);
    }
}