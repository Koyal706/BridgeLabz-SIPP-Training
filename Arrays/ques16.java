import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sum = 0, count = 0;
        for (int i = 2; i <= N; i += 2) {
            sum += i;
            count++;
        }

        if (count == 0) {
            System.out.println("No even numbers found.");
        } else {
            double avg = (double) sum / count;
            System.out.println("Average of even numbers: " + avg);
        }
    }
}
