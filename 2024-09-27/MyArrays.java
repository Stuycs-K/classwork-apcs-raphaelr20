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
}
