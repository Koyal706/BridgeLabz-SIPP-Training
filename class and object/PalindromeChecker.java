class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "Radar";
        pc.displayResult();
    }
}
