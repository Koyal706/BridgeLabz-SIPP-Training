import java.util.*;

public class CPQuestion12 {
    public static String[] splitWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.isEmpty()) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.isEmpty()) words.add(word);
        return words.toArray(new String[0]);
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[][] getWordLengthPairs(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordData) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < Integer.parseInt(wordData[minIndex][1])) minIndex = i;
            if (len > Integer.parseInt(wordData[maxIndex][1])) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordLengthPairs(words);
        int[] indexes = findShortestAndLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[indexes[0]][0]);
        System.out.println("Longest word: " + wordLengths[indexes[1]][0]);
    }
}

/