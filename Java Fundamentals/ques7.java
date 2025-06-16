public class ques7 {
    public static void main(String[] args) {
        int amount3Years = 815;
        int amount4Years = 854;
        int interest1Year = amount4Years - amount3Years;
        int sum = amount3Years - (3 * interest1Year);
        System.out.println("The sum is: Rs. " + sum);
    }
}