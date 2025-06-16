public class Q10 {
    public static void main(String[] args) {
        int cp = 1; // per item
        int totalCP = cp * 20;
        int totalSP = cp * 16;
        double spPerItem = totalCP / 16.0;
        double gain = spPerItem - cp;
        double gainPercent = (gain * 100) / cp;
        System.out.println("Gain percent is: " + gainPercent + "%");
    }
}