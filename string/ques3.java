import java.util.*;
class ques3 {
    static void generateException(String input) {
        int num = Integer.parseInt(input);
        System.out.println("Parsed Number: " + num);
    }

    static void handleException(String input) {
        try {
            int num = Integer.parseInt(input);
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // generateException(input); // Uncomment to test abrupt stop
        handleException(input);
    }
}

