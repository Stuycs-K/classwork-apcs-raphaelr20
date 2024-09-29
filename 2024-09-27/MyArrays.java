public class MyArrays {
  public static String aryToString(int[] nums) {
    String str = "[";
    for (int i = 0; i < nums.length; i++) {
      str += nums[i];
      if (i < nums.length-1)
        str += ", ";
    }
    str += "]";
    return str;
  }
  public static int[] returnCopy(int[]ary) {
    int[] newAry = new int[ary.length];
    for (int i = 0; i<ary.length; i++) {
      newAry[i] = ary[i];
    }
    return newAry;
  }
  public static int[] concatArray(int[]ary1, int[]ary2) {
    int[] newAry = new int[ary1.length+ary2.length];
    for (int i = 0; i<ary1.length; i++) {
      newAry[i] = ary1[i];
    }
    for (int i = ary1.length; i<ary1.length+ary2.length; i++) {
      newAry[i] = ary2[i-ary1.length];
    }
    return newAry;
  }
  public static void main(String[] args) {
    //aryToString
    System.out.println("aryToString TEST CASES");
    System.out.println("Expected: [0, 1, 2, 3], actual: " + aryToString(new int[]{0,1,2,3}));
    System.out.println("Expected: [], actual: " + aryToString(new int[0]));
    System.out.println("Expected: [463], actual: " + aryToString(new int[]{463}));
    System.out.println("Expected: [-8, 20, -103, 4, 6983], actual: " + aryToString(new int[]{-8,20,-103,4,6983}));
    
    //returnCopy
    System.out.println("returnCopy TEST CASES");
    //creates an initial array, then creates a variable for the copy
    int[] a = new int[]{0,1,2,3}, b = returnCopy(a);
    //test if the values are the same by checking if strings are the same
    System.out.print("Expected true: " + aryToString(a).equals(aryToString(b)) + " Expected false: ");
    //test if the actual arrays are the same
    System.out.println(a==b);
    a = new int[0];
    b = returnCopy(a);
    System.out.print("Expected true: " + aryToString(a).equals(aryToString(b)) + " Expected false: ");
    System.out.println(a==b);
    a = new int[]{-8,20,-103,4,6983};
    b = returnCopy(a);
    System.out.print("Expected true: " + aryToString(a).equals(aryToString(b)) + " Expected false: ");
    System.out.println(a==b);
    
    //concatArray
    System.out.println("concatArray TEST CASES");
    //checks if the full array as a string is the same as the two arrays concatenated and then turned into a string
    System.out.println("Expected: [0, 1, 2, 3], actual: " + aryToString(concatArray(new int[]{0,1}, new int[]{2,3})));
    System.out.println("Expected: [82], actual: " + aryToString(concatArray(new int[0], new int[]{82})));
    System.out.println("Expected: [], actual: " + aryToString(concatArray(new int[0], new int[0])));
    System.out.println("Expected: [-8, 20, -103, 4, 6983], actual: " + aryToString(concatArray(new int[]{-8,20}, new int[]{-103,4,6983})));
  }
}
