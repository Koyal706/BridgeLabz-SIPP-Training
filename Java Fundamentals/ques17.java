public class ques17 {
    public static void main(String[] args) {
        int A1 = 12000 * 6 + 8000 * 6;
        int B1 = 18000 * 6 + 24000 * 6;
        int totalProfit = 15600;
        double aShare = (A1 * 1.0 / (A1 + B1)) * totalProfit;
        System.out.println("A's Share = Rs. " + aShare);
    }
}