import java.io.*;
import java.util.*;

public class Day1 {
  public static String[] parse(String filename) {
    try {
      File file=new File (filename);
      Scanner input = new Scanner(file);
      String[] turns = input.nextLine().split(", ");
      input.close();
      return turns;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
  }
  }
  public static int findDistance(String[] turns) {
    int x = 0;
    int y = 0;
    int direction = 0;
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
  }

  public static int findDistance2(String[] turns) {
    int x = 0;
    int y = 0;
    int direction = 0;
    ArrayList<int[]> locations = new ArrayList<int[]>();
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
      for (int c = 0; c<locations.size(); c++) {
        if (locations.get(c)[0]==x && locations.get(c)[1]==y)
          return Math.abs(x)+Math.abs(y);
      }
      locations.add(new int[]{x,y});
    }
    return -1;
  }
  public static void main(String[] args) {
      System.out.println(findDistance(parse("Day1.txt")));
      System.out.println(findDistance2(parse("Day1.txt")));
  }
}
