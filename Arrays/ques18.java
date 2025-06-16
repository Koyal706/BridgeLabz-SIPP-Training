import java.util.Scanner;

public class ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder specialChars = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                specialChars.append(ch).append(" ");
            }
        }

        if (specialChars.length() > 0) {
            System.out.println("Special characters: " + specialChars);
        } else {
            System.out.println("No special characters found.");
        }
    }
}
