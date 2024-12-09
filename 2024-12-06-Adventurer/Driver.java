public class Driver {
    public static void main(String[] args) {
        Adventurer p1 = new Wizard("John", 15, 5);
        Adventurer p2 = new Wizard("Evil James");
        System.out.println(p1.getSpecialName()+" should be magical mushrooms");
        System.out.println(p2.getSpecialName()+" should be magical mushrooms");
        System.out.println(p1.getSpecial()+" should be 5");
        System.out.println(p2.getSpecial()+" should be 3");
        p1.setSpecial(1);
        System.out.println(p1.getSpecial()+" should be 1");
        p2.setSpecial(10);
        System.out.println(p2.getSpecial()+" should be 3");
        p2.setSpecial(-4);
        System.out.println(p2.getSpecial()+" should be 0");
        System.out.println(p1.getSpecialMax()+" should be 5");
        System.out.println(p2.getSpecialMax()+" should be 3");

        System.out.println(p1.attack(p2)+", should be: fire spell - damaged enemy Evil James 2 HP, Evil James has 8 HP remaining");
        p2.setHP(1);
        System.out.println(p1.attack(p2)+", should be: fire spell - Evil James defeated");
        p2.setHP(3);
        System.out.println(p1.attack(p2)+", should be: fire spell - damaged enemy Evil James 2 HP, Evil James has 1 HP remaining");
        p2.setHP(-1);
        System.out.println(p1.attack(p2)+", should be: fire spell - Evil James defeated");
        System.out.println(p2.getHP()+" should be 0");
        System.out.println(p2.support()+ ", should be: heal spell - healed self 5 HP to 5 HP");
        System.out.println(p1.support(p2)+", should be: heal spell - healed ally Evil James 3 HP, Evil James has 8 HP");
        System.out.println(p2.support()+ ", should be: heal spell - Evil James is at max health (10 HP)");
        System.out.println(p2.specialAttack(p1)+", should be: I do not have enough magical mushrooms to use special attack");
        System.out.println(p2.restoreSpecial(6)+" should be 3");
        System.out.println(p2.specialAttack(p1)+", should be: special spell - damaged enemy John 5 HP, John has 10 HP remaining");
        p2.specialAttack(p1);
        System.out.println(p2.specialAttack(p1)+", should be: special spell - John defeated, 0 magical mushrooms left");
    }
}