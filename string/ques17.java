class Q17_SplitCompare {
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

    public static String[] splitUsingCharAt(String str) {
        List<String> words = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < getLength(str); i++) {
            char c = str.charAt(i);
            if (c != ' ') temp += c;
            else {
                if (!temp.isEmpty()) words.add(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) words.add(temp);
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] customSplit = splitUsingCharAt(input);

        boolean areEqual = compareArrays(builtInSplit, customSplit);

        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Custom split: " + Arrays.toString(customSplit));
        System.out.println("Are both equal? " + areEqual);
    }
}
