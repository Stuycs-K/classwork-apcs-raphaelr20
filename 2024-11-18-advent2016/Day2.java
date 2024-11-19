import java.util.*;
import java.io.*;

public class Day2 {
  public static String[][] parse(String filename) {
    try {
      Scanner input = new Scanner(new File(filename));
      String[][] moves = new String[5][];
      for (int i = 0; input.hasNextLine(); i++) {
        moves[i] = input.nextLine().split("");
      }
      return moves;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }
  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(parse("Day2.txt")));
  }
}
