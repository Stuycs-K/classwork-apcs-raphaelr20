import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    return((a+b)>c&&(b+c)>a&&(a+c)>b);
  }
  public static int countTrianglesA(String filename){
    try {
        File file=new File (filename);
        Scanner input = new Scanner(file);
        int count=0;
        while(input.hasNextLine()){
            if(isTriangle(input.nextInt(),input.nextInt(),input.nextInt())){
                count++;
            }
        }
        input.close();
        return count;
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return -1;
    }
  }
  public static int countTrianglesB(String filename){
    try {
        File file=new File (filename);
        Scanner input = new Scanner(file);
        int count=0;
        while(input.hasNextLine()) {
            int[] triangle0 = new int[3];
            int[] triangle1 = new int[3];
            int[] triangle2 = new int[3];
            for (int i = 0; i < 3; i++) {
                triangle0[i] = input.nextInt();
                triangle1[i] = input.nextInt();
                triangle2[i] = input.nextInt();
            }
            if (isTriangle(triangle0[0], triangle0[1], triangle0[2]))
                count ++;
            if (isTriangle(triangle1[0], triangle1[1], triangle1[2]))
                count ++;
            if (isTriangle(triangle2[0], triangle2[1], triangle2[2]))
                count ++;
        }
        input.close();
        return count;
    } catch (FileNotFoundException ex) {
        System.out.println("File not found");
        return -1;
    }
  }
}