import java.util.*;

public class ques26 {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
            System.out.println("Player " + (i+1) + " height: " + heights[i] + " cm");
        }

        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findMin(heights));
        System.out.println("Tallest Height: " + findMax(heights));
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}
