import java.util.Scanner;

public class ques11 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int manualLength = findLength(str);
        System.out.println("Manual length: " + manualLength);
        System.out.println("Using length(): " + str.length());
    }
}
