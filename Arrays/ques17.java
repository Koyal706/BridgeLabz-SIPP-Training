import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int largest = 0;
        int smallest = 9;

        while (number != 0) {
            int digit = (int)(number % 10);
            if (digit > largest) largest = digit;
            if (digit < smallest) smallest = digit;
            number /= 10;
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
    }
}
