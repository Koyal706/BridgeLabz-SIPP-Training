import java.util.Scanner;

public class Ques40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
