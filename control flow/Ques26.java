import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, power, result = 1, counter = 0;

        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter the power: ");
        power = sc.nextInt();

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result: " + result);
    }
}
