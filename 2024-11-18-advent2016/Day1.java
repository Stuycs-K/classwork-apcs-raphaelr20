import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int findDistance(filename) {
    try {
      File file=new File (filename);
      Scanner input = new Scanner(file);
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return -1;
    }
  }
}
