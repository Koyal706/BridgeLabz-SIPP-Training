import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
      int noOfPen = 14;
      int noOfChildren = 3;
      int penForStudent = noOfPen / noOfChildren;
      int remaining = noOfPen % noOfChildren;
      System.out.println("each student get" + penForStudent + "pen  , remaining pens" + remaining);
    }
}