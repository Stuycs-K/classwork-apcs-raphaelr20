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
        String checksum = room.substring(room.length()-6, room.length()-1);
        int ID = Integer.parseInt(room.substring(room.length()-10,room.length()-7));
        ArrayList<String> letters = new ArrayList<String>();
        for (int x = 0; x < room.length()-11; x++) {
            if (room.charAt(i)!='-') {
                letters.add(room.substring(i,i+1));
            }
        }
        
    }
    
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(parse("Day4.txt"));
  }
}