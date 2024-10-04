public class ArrayMethods{
    //1. Write both your names + emails at the top of the document as a comment.
    //Nowar Nizum nnizum60@stuy.edu
    //Raphael Ramot rramot60@stuy.edu
  
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
            for (int x = 0; x < ary[i].length; x++){
                newString += ary[i][x];
                if (x < ary[i].length - 1){
                    newString += ", ";
                }
            }
            newString += "]";
            str += newString;
            if (i < ary.length-1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int x = 0; x < nums[i].length; x++) {
                sum += nums[i][x];
            }
        }
        return sum;
    }

    /**Rotate an array by returning a new array with the rows and columns swapped.
      * You may assume the array is rectangular and neither rows nor cols is 0.
      * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
      */
    public static int[][] swapRC(int[][]nums){
        int[][] newNums = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums[0].length; i++) {
            for (int x = 0; x < nums.length; x++) {
                newNums[i][x] = nums[x][i];
            }
        }
        return newNums;
    }

    //3. Modify a given 2D array of integer as follows:
    //Replace all the negative values:
    //-When the row number is the same as the column number replace
    //that negative with the value 1
    //-All other negatives replace with 0
    public static void replaceNegative(int[][] vals) {
        for (int i = 0; i < vals.length; i++) {
            for (int x = 0; x < vals[i].length; x++) {
                if (vals[i][x]<0) {
                    if (i==x)
                        vals[i][x] = 1;
                    else
                        vals[i][x] = 0;
                }
            }
        }
    }

    //4. Make a copy of the given 2d array.
    //When testing : make sure that changing the original does NOT change the copy.
    //DO NOT use any built in methods that "copy" an array.
    //You SHOULD write a helper method for this.
    //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[][] copy(int[][] nums){
        int[][] newNums = new int[nums.length][];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = new int[nums[i].length];
            for (int x = 0; x < nums[i].length; i++) {
                newNums[i][x] = nums[i][x];
            }
        }
        return newNums;
    }
    public static boolean testCopy(int[][] nums) {
        int[][] numsCopy = copy(nums);
        if (aryToString(nums).equals(aryToString(numsCopy))) {
            nums[0] = new int[10];
            return aryToString(nums).equals(aryToString(numsCopy)) == false;
        }
        return false;
    }
    
    public static void main (String [] args){
        //arrToString test cases
        System.out.println("arrToString TEST CASES");
        System.out.println("Expected: [[0, 1], [2], []], actual: " + arrToString(new int[][]{{0,1}, {2}, {}}));
        System.out.println("Expected: [[], [], [], []], actual: " + arrToString(new int[4][0]));
        System.out.println("Expected: [], actual: " + arrToString(new int[0][0]));
        System.out.println("Expected: [[82, 63, -2], [21, 0, 4], [920, 612, 21]], actual: " + arrToString(new int[][]{{82, 63, -2}, {21, 0, 4}, {920, 612, 21}}));
        //arr2DSum test cases
        System.out.println("arr2DSum TEST CASES");
        System.out.println("Expected: 18, actual: " + arr2DSum(new int[][]{{3, 21, -9}, {0}, {97, -94}}));
        System.out.println("Expected: 74, actual: " + arr2DSum(new int[][]{{17, 2}, {24, 7}, {-8, 32}}));
        System.out.println("Expected: 0, actual: " + arr2DSum(new int[0][0]));
        System.out.println("Expected: 0, actual: " + arr2DSum(new int[8][0]));
        //swapRC test cases
        System.out.println("swapRC TEST CASES");
        System.out.println("Expected: " + arrToString(new int[][]{{23}, {51}, {12}, {-19}}) + ", actual: " + arrToString(swapRC(new int[][]{{23, 51, 12, -19}})));
        System.out.println("Expected: " + arrToString(new int[][]{{1, 5, 6}, {2, 81, -3}, {41, 22, 763}}) + ", actual: " + arrToString(swapRC(new int[][]{{1, 2, 41}, {5, 81, 22}, {6, -3, 763}})));
        System.out.println("Expected: " + arrToString(new int[][]{{23, 51, 12, -19}}) + ", actual: " + arrToString(swapRC(new int[][]{{23}, {51}, {12}, {-19}})));
        //replaceNegative test cases
        System.out.println("replaceNegative TEST CASES");
        int[][] arr = new int[][]{{23, 1}, {2}};
        System.out.print("Expected: " + arrToString(arr) + ", actual: ");
        replaceNegative(arr);
        System.out.println(arrToString(arr));
        arr = new int[][]{{-1, -8}, {0, -32}};
        System.out.print("Expected: " + arrToString(new int[][]{{1, 0}, {0, 1}}) + ", actual: ");
        replaceNegative(arr);
        System.out.println(arrToString(arr));
        arr = new int[][]{{0, -38, 38}};
        System.out.print("Expected: " + arrToString(new int[][]{{0, 0, 38}}) + ", actual: ");
        replaceNegative(arr);
        System.out.println(arrToString(arr));
        //copy test cases
        System.out.println("copy TEST CASES");
        System.out.println("Expected: true, actual: " + testCopy(new int[][]{{0, 1}, {2, 3}, {4, 5}}));
        System.out.println("Expected: true, actual: " + testCopy(new int[][]{{0, 1}, {2, 3, 4, 5}}));
        System.out.println("Expected: true, actual: " + testCopy(new int[1][0]));
    }
}
