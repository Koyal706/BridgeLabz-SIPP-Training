import java.util.*;
class ques1 {
    static void generateException(String[] names) {
        System.out.println("Accessing index out of bounds...");
        System.out.println(names[names.length]); // Will throw exception
    }

    static void handleException(String[] names) {
        try {
            System.out.println("Accessing index out of bounds...");
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        // generateException(names); // Uncomment to test abrupt stop
        handleException(names);
    }
}
