import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();
        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
    }
}