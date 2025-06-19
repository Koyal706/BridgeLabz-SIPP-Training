class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println("Student " + (i + 1) + " Can Vote: " + canStudentVote(ages[i]));
        }
    }
}
