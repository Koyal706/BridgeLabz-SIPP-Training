public class ques13 {
    public static void main(String[] args) {
        int boys = 3;
        int girls = 4;
        for (int i = 1; i <= 100; i++) {
            if ((i + 6) * 6 == (girls * 5 * i / boys)) {
                System.out.println("Initial boys: " + i);
                break;
            }
        }
    }
}