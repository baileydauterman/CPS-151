/*
Write a Java method

public static boolean sameElements(int[] a, int[] b)

that checks whether two arrays have the same elements in some order, with the same multiplicities.

For example the arrays,

1   4   9  16   9   7   4   9  11

and

11  1   4    9  16   9   7   4   9

would be considered identical, but the arrays

1   4   9  16   9   7    4   9  11

and

11  11   7   9  16   4   1   4   9

would not.
*/

import java.util.Arrays;

class lab0 {
  public static void main(String[] args) {
    int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] b = {11, 1, 4, 9, 16, 9, 7, 4, 9};
    int[] c = {11, 11, 7, 9, 16, 4, 1, 4, 9};

    System.out.print("The arrays a and b ");

    if (!sameElements(a, b)) {
        System.out.print("do not ");
    }

    System.out.println("have the same elements.");

    System.out.print("The arrays a and c ");

    if (!sameElements(a, c)) {
        System.out.print("do not ");
    }

    System.out.println("have the same elements.");
    } // end main method

  public static boolean sameElements(int[] a, int[]b) {
    if(a.length != b.length){
      return false;
    } else {
      Arrays.sort(a);
      Arrays.sort(b);
      if(Arrays.equals(a, b)) {
        return true;
      }
      return false;
    }
  }
}
