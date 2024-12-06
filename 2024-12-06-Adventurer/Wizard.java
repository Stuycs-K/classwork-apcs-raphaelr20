import java.util.Random;
public class Wizard extends Adventurer {
    private int special;
    private int maxSpecial;
    public Wizard(String name) {
        super(name);
        special = 3;
        maxSpecial = 3;
    }
    public Wizard(String name, int health, int special) {
        super(name,health);
        this.special = special;
        maxSpecial = special;
    }

    public String getSpecialName() {
        return "magical mushrooms";
    }
    public int getSpecial() {
        return special;
    }
    public void setSpecial(int n) {
        if (n>maxSpecial) {
            n = maxSpecial;
        }
        special = n;
    }
    public int getSpecialMax() {
        return maxSpecial;
    }

    public String attack(Adventurer other) {
        if (other.getHP()<3) {
            other.setHP(0);
            return "fire spell - "+other.getName()+" deafeated";
        }
        other.applyDamage(2);
        return "fire spell - damaged enemy "+other.getName()+" 2 HP";
    }
    public String support(Adventurer other) {
        if (other.getmaxHP()-other.getHP()<4) {
            other.setHP(other.getmaxHP());
            return "heal spell - ally "+other.getName()+" at max health";
        }
        other.setHP(other.getHP()+3);
        return "heal spell - healed ally "+other.getName()+" 3 HP";
    }

    public String support() {
        if (this.getmaxHP()-this.getHP()<6) {
            this.setHP(this.getmaxHP());
            return "heal spell - "+this.getName()+" is at max health";
        }
        this.setHP(this.getHP()+5);
        return "heal spell - healed self 5 HP";
    }
    public String specialAttack(Adventurer other) {

    }
}
