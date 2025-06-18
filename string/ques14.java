class ques14 {
    public static String checkCharType(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch; // to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVowelConsonant(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = checkCharType(str.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        int[] counts = countVowelConsonant(str);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
