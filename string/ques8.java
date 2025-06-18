import java.util.*;
class ques8 {
    static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] manual = manualToCharArray(text);
        char[] builtin = text.toCharArray();
        boolean result = compareArrays(manual, builtin);
        System.out.println("Manual: " + Arrays.toString(manual));
        System.out.println("Built-in: " + Arrays.toString(builtin));
        System.out.println("Are they equal? " + result);
    }
}
