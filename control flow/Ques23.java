import java.util.Scanner;
public class Ques23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= n) sum += i++;
        int formula = n * (n + 1) / 2;
        System.out.println("Using while loop: " + sum);
        System.out.println("Using formula: " + formula);
    }
}