import java.util.Scanner;

public class Ques38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0, digit;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int originalNumber = number;

        while (originalNumber != 0) {
            digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
