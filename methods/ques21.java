import java.util.*;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.println(number + " is Positive and " + (isEven(number) ? "Even" : "Odd"));
            } else {
                System.out.println(number + " is Negative");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 0) System.out.println("First and last numbers are equal");
        else if (comparison > 0) System.out.println("First number is greater than last number");
        else System.out.println("First number is less than last number");
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }
}
