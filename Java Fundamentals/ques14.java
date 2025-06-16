public class ques14 {
    public static void main(String[] args) {
        for (int total = 1; total <= 100; total++) {
            int alcohol = (4 * total) / 7;
            int water = total - alcohol;
            int newAlcohol = alcohol + 21;
            int newWater = water - 21;
            if (newWater > 0 && newAlcohol * 2 == 5 * newWater) {
                System.out.println("Initial volume: " + total + " litres");
                break;
            }
        }
    }
}