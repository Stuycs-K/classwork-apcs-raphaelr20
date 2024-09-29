public class MyArrays {
  public static String aryToString(int[] nums) {
    String str = "[";
    for (int i = 0; i < nums.length; i++) {
      str += nums[i];
      if (i < nums.length)
        str += ", ";
    }
    str += "]";
    return str;
  }
  public static void main(String[] args) {
    System.out.println("aryToString TEST CASES");
    System.out.println("Expected: \"[0,1,2,3]\", actual: " + aryToString(new int[]{0,1,2,3}));
    System.out.println("Expected: \"[]\", actual: " + aryToString(new int[0]));
    System.out.println("Expected: \"[463]\", actual: " + aryToString(new int[]{463}));
    System.out.println("Expected: \"[-8,20,-103,4,6983]\", actual: " + aryToString(new int[]{-8,20,-103,4,6983}));
  }
}
