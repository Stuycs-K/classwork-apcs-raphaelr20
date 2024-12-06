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
}
