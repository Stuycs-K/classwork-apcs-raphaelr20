public class Driver {
    public static void createBorder() {
        Text.color(Text.background(Text.MAGENTA), Text.CYAN);
        Text.go(1,1);
        for (int i = 0; i<80; i++) {
            System.out.print('I');
        }
        for (int i = 1; i<29; i++) {
            Text.go(i,1);
            System.out.print('I');
            Text.go(i, 80);
            System.out.print('I');
        }
        Text.go(30,1);
        for (int i = 0; i<80; i++) {
            System.out.print('I');
        }
    }
    public static int[] randomArray(int size) {
        int[]randArr = new int[size];
        for (int i = 0; i<size; i++) {
            randArr[i] = (int)(Math.random()*100);
        }
        return randArr;
    }
    public static void placeInts() {
        // where the integers will go
        int[] places = new int[]{19,40,59};
        int[] nums = randomArray(3);
        for (int i = 0; i<3; i++) {
            Text.go(2,places[i]);
            if (nums[i]<25)
                Text.color(1,Text.RED);
            else if (nums[i]>75)
                Text.color(1,Text.GREEN);
            else 
                Text.color(Text.WHITE);
            System.out.print(nums[i]);
        }
    }
    public static void extraLine() {
        Text.go(3,2);
        Text.color(Text.background(Text.MAGENTA), Text.CYAN);
        for (int i = 0; i<78; i++) {
            System.out.print("-");
        }
    }
    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);
        placeInts();
        System.out.print(Text.RESET);
        extraLine();
        createBorder();
        System.out.print(Text.RESET);
        System.out.println();
        Text.go(31,1);
    }
}