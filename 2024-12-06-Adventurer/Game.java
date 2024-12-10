import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose your character : Gandalf the Wizard (G) or Mr. K the CodeWarrior (K)");
        boolean flag = true;
        String character = "";
        while (flag) {
            String input = userInput.nextLine();
            if (input.equals("G") || input.equals("K")) {
                character = input;
                flag = false;
            }
            else {
                System.out.println("Please type G or K");
            }
        }
        Adventurer player;
        Adventurer computer;
        if (character.equals("G")) {
            System.out.println("You have selected Gandalf the Wizard.");
            player = new Wizard("Gandalf", 15, 3);
            computer = new CodeWarrior("Mr. K");
        }
        else {
            System.out.println("You have selected Mr. K the CodeWarrior.");
            computer = new Wizard("Gandalf", 15, 3);
            player = new CodeWarrior("Mr. K");
        }
        
        while (player.getHP()>0 && computer.getHP()>0) {
            
        }
        userInput.close();
    }
}