import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (Enter: high / low / correct)");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will guess it.");

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);

            switch (feedback) {
                case "low":
                    low = guess + 1;
                    break;
                case "high":
                    high = guess - 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number.");
                    found = true;
                    break;
                default:
                    System.out.println("Please enter valid feedback (high/low/correct).");
            }
        }
    }
}
