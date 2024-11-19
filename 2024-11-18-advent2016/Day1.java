import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
  public static int findDistance(String filename) {
    try {
      File file=new File (filename);
      Scanner input = new Scanner(file);
      int x = 0;
      int y = 0;
      int direction = 0;
      String[] turns = input.nextLine().split(", ");
      System.out.println(Arrays.toString(turns));
      for (int i = 0; i<turns.length; i++) {
        if (turns[i].substring(0,1).equals("L")) {
          direction -= 90;
        }
        else {
          direction += 90;
        }
        direction = direction%360;
        if (direction < 0) {
          direction += 360;
        }
        int distance = Integer.parseInt(turns[i].substring(1));
        if (direction == 0) {
          y += distance;
        }
        else if (direction == 90) {
          x += distance;
        }
        else if (direction == 180) {
          y -= distance;
        }
        else if (direction == 270) {
          x -= distance;
        }
      }
      return Math.abs(x)+Math.abs(y);
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return -1;
    }
  }
  public static void main(String[] args) {
      System.out.println(findDistance("Day1.txt"));
  }
}
