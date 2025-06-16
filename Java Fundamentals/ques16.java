public class ques16 {
    public static void main(String[] args) {
        int n = 3;
        int r = 2;
        int result = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("3C2 = " + result);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}