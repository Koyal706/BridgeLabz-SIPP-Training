import java.util.Scanner;
public class ques9 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + result[0] + ", Cos: " + result[1] + ", Tan: " + result[2]);
    }
}