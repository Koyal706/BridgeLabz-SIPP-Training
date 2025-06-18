import java.util.Scanner;

public class ques9 {
    public static String substringWithCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = substringWithCharAt(str, start, end);
        String sub2 = str.substring(start, end);

        System.out.println("Using charAt(): " + sub1);
        System.out.println("Using substring(): " + sub2);
        System.out.println("Are they equal? " + compareStrings(sub1, sub2));
    }
}
