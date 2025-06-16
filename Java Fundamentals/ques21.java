import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int perChild = chocolates / children;
        int remainder = chocolates % children;
        System.out.println("The number of chocolates each child gets is " + perChild + " and the number of remaining chocolates is " + remainder);
    }
}