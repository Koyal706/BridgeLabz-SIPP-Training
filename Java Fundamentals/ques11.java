public class ques11 {
    public static void main(String[] args) {
        int current = 4;
        int stillWater = 10;
        int upstream = stillWater - current;
        int downstream = stillWater + current;
        int timeDiff = 3;
        int distance = (upstream * downstream * timeDiff) / (downstream - upstream);
        System.out.println("Distance is: " + distance + " km");
    }
}