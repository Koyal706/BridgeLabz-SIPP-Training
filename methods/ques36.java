public class ques36 {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        int[] digits = getDigits(n);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int n) {
        int[] digits = getDigits(n);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Digit count: " + countDigits(num));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
    }
}
