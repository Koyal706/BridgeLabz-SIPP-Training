import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, counter = 1;

        System.out.print("Enter a positive number: ");
        number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        System.out.print("Factors: ");
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
