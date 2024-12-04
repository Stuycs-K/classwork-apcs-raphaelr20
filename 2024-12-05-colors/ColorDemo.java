public class ColorDemo {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            for (int x = 0; x<8; x++) {
                System.out.print("\u001b[4"+x+"m.");
            }
            for (int x = 7; x>=0; x--) {
                System.out.print("\u001b[4"+x+"m.");
            }
        }
        System.out.print("\u001b[0m");
    }
}