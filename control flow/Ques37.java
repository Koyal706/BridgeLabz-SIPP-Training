import java.util.Scanner;

public class Ques37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
