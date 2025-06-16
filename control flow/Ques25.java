import java.util.Scanner;

public class Ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, power, result = 1;

        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter the power: ");
        power = sc.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result: " + result);
    }
}
