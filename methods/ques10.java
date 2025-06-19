import java.util.Scanner;
public class ques10 {
    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        System.out.println("Wind Chill: " + calculateWindChill(temperature, windSpeed));
    }
}
