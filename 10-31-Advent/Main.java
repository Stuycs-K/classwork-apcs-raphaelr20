import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);

      //you don't want a for loop here unless you know the size of the data set

      // while(input.hasNext()){
      //   System.out.println(input.next());
      // }
      // while(input.hasNextLine()){
      //   System.out.println(input.nextLine());
      // }

      Scanner sc1 = new Scanner("This is a bunch of words");
      while(sc1.hasNext()){
        System.out.println(sc1.next());
      }
    }
  }
