import java.util.*;

public class ques24 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit * digit;
        return sum;
    }

    public static boolean isHarshad(int number) {
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        int[] digits = getDigits(number);
        for (int digit : digits) freq[digit]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }
}