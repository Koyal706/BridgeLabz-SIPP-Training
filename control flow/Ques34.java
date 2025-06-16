import java.util.Scanner;

public class Ques34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }
}
