public class ques33 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int digit : d) if (digit == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] d, int num) {
        int sum = 0, n = d.length;
        for (int digit : d) sum += Math.pow(digit, n);
        return sum == num;
    }

    public static void findMinMax(int[] d) {
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for (int digit : d) {
            if (digit > max) {
                secMax = max; max = digit;
            } else if (digit > secMax && digit != max) secMax = digit;
            if (digit < min) {
                secMin = min; min = digit;
            } else if (digit < secMin && digit != min) secMin = digit;
        }
        System.out.printf("Largest: %d, 2nd Largest: %d\n", max, secMax);
        System.out.printf("Smallest: %d, 2nd Smallest: %d\n", min, secMin);
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        System.out.println("Duck? " + isDuck(digits));
        System.out.println("Armstrong? " + isArmstrong(digits, num));
        findMinMax(digits);
    }
}
