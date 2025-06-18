class Q15_WordLengths2D {
    public static String[] splitWords(String text) {
        List<String> words = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                temp += c;
            } else if (!temp.isEmpty()) {
                words.add(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) words.add(temp);
        return words.toArray(new String[0]);
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = getWordsWithLengths(words);
        display(result);
    }
}
