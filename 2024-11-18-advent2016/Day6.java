import java.io.*;
import java.util.*;

public class Day6 {
    public static ArrayList<String> parse(String filename) {
        try {
            Scanner input = new Scanner(new File(filename));
            ArrayList<String> messages = new ArrayList<String>();
            while (input.hasNext()) {
                messages.add(input.nextLine());
            }
            input.close();
            return messages;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return null;
        }
    }
    public static String corrector(ArrayList<String> messages) {
        int[][] counts = new int[8][26];
        for (int i = 0; i<messages.size(); i++) {
            for (int x = 0; x<8; x++) { 
            counts[x][messages.get(i).charAt(x)-97]++;
            }
        }
        String code = "";
        for (int i = 0; i<8; i++) {
            int maxAt = 0;
            for (int x = 1; x<26; x++) {
                if (counts[i][x]>counts[i][maxAt]) {
                    maxAt = x;
                }
            }
            code += (char)(maxAt + 'a');
        }
        return code;
    }
    public static String corrector2(ArrayList<String> messages) {
        int[][] counts = new int[8][26];
        for (int i = 0; i<messages.size(); i++) {
            for (int x = 0; x<8; x++) { 
            counts[x][messages.get(i).charAt(x)-97]++;
            }
        }
        String code = "";
        for (int i = 0; i<8; i++) {
            int minAt = 0;
            for (int x = 1; x<26; x++) {
                if (counts[i][x]<counts[i][minAt] && counts[i][x]!=0) {
                    minAt = x;
                }
            }
            code += (char)(minAt + 'a');
        }
        return code;
    }
    public static void main(String[] args) {
        System.out.println(corrector(parse("Day6.txt")));
        System.out.println(corrector2(parse("Day6.txt")));
    }
}