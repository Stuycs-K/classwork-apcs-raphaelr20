public class Words {
    public static void makeWords(int remainingLetters, String result, String alphabet) {
        if (remainingLetters==0) {
            System.out.println(result);
        }
        else {
            for (int i=0; i<alphabet.length(); i++) {
                makeWords(remainingLetters-1, result+alphabet.substring(i,i+1), alphabet);
            }
        }
    }
    public static void main(String[] args) {
        // makeWords(2,"","ab");
        // makeWords(3,"","abc");
        // makeWords(4,"","01");
        // makeWords(5,"","x");
    }
}