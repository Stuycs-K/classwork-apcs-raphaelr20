import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static boolean trichecker(int a, int b, int c){
    return((a+b)>c&&(b+c)>a&&(a+c)>b);
  }
  public static int countTrianglesA(String filename){
    File file=new File (filename);
    Scanner input = new Scanner(file);
    int count=0;
    while(input.hasNextLine()){
      if(trichecker(input.nextInt(),input.nextInt(),input.nextInt())){
        count++;
      }
    }
    return count;
  }
  public static int countTrianglesB(String filename){
    File file=new File (filename);
    Scanner input = new Scanner(file);
    String[] triangles=input.split("\n");
    for(int i=0; i<triangles.length; i++){
      triangles[i].split(" ");
    }
     
  }
}