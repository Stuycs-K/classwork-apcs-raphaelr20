import java.util.*;
import java.io.*;

public class Day4 {
  public static ArrayList<String> parse(String filename) {
    try {
      Scanner input = new Scanner(new File(filename));
      ArrayList<String> rooms = new ArrayList<String>();
      while (input.hasNext()) {
        rooms.add(input.nextLine());
      }
      input.close();
      return rooms;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return null;
    }
  }
  public static int sumIDs(ArrayList<String> rooms) {
    int sum = 0;
    for (int i = 0; i<rooms.size(); i++) {
        String room = rooms.get(i);
        
    }
    
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(parse("Day4.txt"));
  }
}