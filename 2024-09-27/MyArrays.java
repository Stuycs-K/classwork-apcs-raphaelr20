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
  public static int[] returnCopy(int[] ary) {
    int[] newAry = int[ary.length];
    for (int i = 0; i<ary.length; i++) {
      newAry[i] = ary[i];
    }
    return newAry;
  }
  public static void main(String[] args) {
    System.out.println("aryToString TEST CASES");
    System.out.println("Expected: \"[0, 1, 2, 3]\", actual: " + aryToString(new int[]{0,1,2,3}));
    System.out.println("Expected: \"[]\", actual: " + aryToString(new int[0]));
    System.out.println("Expected: \"[463]\", actual: " + aryToString(new int[]{463}));
    System.out.println("Expected: \"[-8, 20, -103, 4, 6983]\", actual: " + aryToString(new int[]{-8,20,-103,4,6983}));
    System.out.println("returnCopy TEST CASES");
    int[] a = new int[]{0,1,2,3}, b = returnCopy(a);
    System.out.println("Expected: " + a + ", actual: " + b + ", same array?: " + a==b);
    int[] a = new int[0], b = returnCopy(a);
    System.out.println("Expected: " + a + ", actual: " + b + ", same array?: " + a==b);
    int[] a = new int[]{463}, b = returnCopy(a);
    System.out.println("Expected: " + a + ", actual: " + b + ", same array?: " + a==b);
    int[] a = new int[]{-8,20,-103,4,6983}, b = returnCopy(a);
    System.out.println("Expected: " + a + ", actual: " + b + ", same array?: " + a==b);
  }
}
