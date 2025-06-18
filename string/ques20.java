import java.util.Scanner;

public class Q20_CharTypeCheck {
    static String getCharType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        } else return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.printf("%-10s%-15s\n", "Character", "Type");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.printf("%-10c%-15s\n", ch, getCharType(ch));
        }
    }
}
