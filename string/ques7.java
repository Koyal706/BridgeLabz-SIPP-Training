class ques7 {
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to test abrupt stop
        handleException();
    }
}