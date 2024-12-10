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
        
        while (player.getHP()>0) {
            System.out.println("Player: "+player.getName()+", "+player.getHP()+"/"+player.getmaxHP()+" HP, "+player.getSpecial()+"/"+player.getSpecialMax()+" "+player.getSpecialName());
            System.out.println("Enemy: "+computer.getName()+", "+computer.getHP()+"/"+computer.getmaxHP()+" HP, "+computer.getSpecial()+"/"+computer.getSpecialMax()+" "+computer.getSpecialName());
            System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
            boolean flag2 = true;
            String action = "";
            while (flag2) {
                String inp = userInput.nextLine();
                if (inp.equals("a") || inp.equals("sp") || inp.equals("su") || inp.equals("quit")) {
                    action = inp;
                    flag2 = false;
                }
                else {
                    System.out.println("Please type a valid input");
                }
            }
            if (action.equals("quit"))
                break;
            else if (action.equals("a"))
                System.out.println(player.attack(computer));
            else if (action.equals("sp"))
                System.out.println(player.specialAttack(computer));
            else if (action.equals("su"))
                System.out.println(player.support());
            if (computer.getHP()<=0) {
                break;
            }
            int compAction = (int)(Math.random()*3);
            if (compAction == 0) {
                System.out.println(computer.attack(player));
            }
            if (compAction == 1) {
                System.out.println(computer.specialAttack(player));
            }
            if (compAction == 2) {
                System.out.println(computer.support());
            }
        }
        if (player.getHP()<=0)
            System.out.println("You lose. Better luck next time!");
        if (computer.getHP()<=0)
            System.out.println("You win!");
        System.out.println("Thanks for playing!");
        userInput.close();
    }
}