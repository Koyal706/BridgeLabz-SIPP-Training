public class ques20 {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) min = ages[i];
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) max = heights[i];
        }
        return max;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestAge = findYoungest(ages);
        int tallestHeight = findTallest(heights);

        for (int i = 0; i < 3; i++) {
            if (ages[i] == youngestAge) {
                System.out.println(names[i] + " is the youngest.");
            }
            if (heights[i] == tallestHeight) {
                System.out.println(names[i] + " is the tallest.");
            }
        }
    }
}
