public class Driver {
    public static void createBorder() {
        Text.color(Text.background(Text.MAGENTA), Text.CYAN);
        Text.go(1,1);
        for (int i = 0; i<80; i++) {
            System.out.print('I');
        }
        for (int i = 1; i<30; i++) {
            Text.go(i,1);
            System.out.print('I');
            Text.go(i, 80);
            System.out.print('I');
        }
        Text.go(31,1);
        for (int i = 0; i<80; i++) {
            System.out.print('I');
        }
    }
    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        createBorder();
    }
}