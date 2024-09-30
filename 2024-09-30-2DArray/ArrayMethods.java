public class ArrayMethods{

  public static void main (String [] args){
    System.out.println(aryToString(new int [] {2, 3, 4, 9});)
  }
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
  //1. Write both your names + emails at the top of the document as a comment.
  //Nowar Nizum nnizum60@stuy.edu
  //Raphael Ramot rramot60@stuy.edu

//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String str = "[";
  String newString;
  for (int i = 0; i < ary.length; i++){
    newString = "[";
    for (int x = 0; i < ary[i].length; x ++){
      newString += ary[i][x];
      if (x < ary[i].length - 1){
        newString += ", ";
      }
    }
    newString += "]";
    if (i < ary.length-1) {
      str += ", ";
    }
  }
  str += "]"
  return str;
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}
}
