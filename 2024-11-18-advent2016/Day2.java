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
  public static String passkey(String[][] moves) {
    String code = "";
    int place = 5;
    for (int i = 0; i<moves.length; i++) {
      for (int x = 0; x<moves[i].length; x++) {
        if (moves[i][x].equals("U") && place>3)
          place-=3;
        else if (moves[i][x].equals("D") && place<7)
          place+=3;
        else if (moves[i][x].equals("L") && place!=1 && place!=4 && place!=7)
          place-=1;
        else if (place!=3 && place!=6 && place!=9)
          place+=1;
      }
      code+=place;
    }
    return code;
  }
  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(parse("Day2.txt")));
    System.out.println(passkey(parse("Day2.txt")));
  }
}
