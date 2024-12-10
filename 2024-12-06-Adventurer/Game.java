import java.util.Scanner;
public class Game {
    public static String checkCharacter() {
        Scanner userInput = new Scanner(System.in);
        String character = userInput.nextLine();
        if (character.equals("K") || character.equals("G")) {
            userInput.close();
            return character;
        }
        else {
            System.out.println("Please type G or K");
            checkCharacter();
        }
    }
    public static void main(String[] args) {
        Wizard Gandalf = new Wizard("Gandalf", 15, 3);
        CodeWarrior K = new CodeWarrior("Mr. K");
        System.out.println("Choose your character : Gandalf the Wizard (G) or Mr. K the CodeWarrior (K)");
        if (checkCharacter().equals("G")) {
            System.out.println("You have selected Gandalf the Wizard.");
        }
        else {
            System.out.println("You have selected Mr. K the CodeWarrior.");
        }
        Scanner userInput = new Scanner(System.in);
        while (Gandalf.getHP()>0 && K.getHP()>0) {
            
        }
        userInput.close();
    }
}