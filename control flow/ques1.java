public class Ques1 {
    public static void main(String[] args) {
        int n = 10; // you can change this value
        if (n >= 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}