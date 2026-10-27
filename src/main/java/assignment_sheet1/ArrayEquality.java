package assignment_sheet1;

public class ArrayEquality {


    /**
     * checks whether two integer arrays contain the same values,
     * regardless of order, using brute force.
     *
     * @param first the first integer array; may be null
     * @param second the second integer array; may be null
     * @return true if both arrays contain the same values
     * with the same fequencies, regardless of order;
     * otherwise false
     * Time complexity: O(n2), from the nested loops.
     * Space complexity: O(n), for the matched array.
     * limitation:nested loops can be slow for large arrays.
     */

public static boolean bruteForceEqual(int[] first, int[] second) {

    if (first == null || second == null) {
    return first == second;
    }

    if (first.length != second.length) {
         return false;

    }

    boolean[] matched = new boolean[second.length];

    for (int i = 0; i < first.length; i++) {

        boolean found = false;

        for (int j = 0; j < second.length; j++) {

            if (!matched[j] && first[i] == second[j]) {
                matched[j] = true;
                found = true;
                break;

             }
          }

          if (!found) {
               return false;
          }
    }

    return true;
  }

/**
* checks whether two integer arrays contain the same values
* regardless of order, using sorting nd two pointers.
*
*Both arryas may contain duplicate or negative values.
* The original arrays are not modified.
*
* @param first the first integer array; may be null
* @param second the second integer array; may be null
* @return true if both arrays contain the same values
*          with the same frequncies, or if both are null;
*          otherwise false
* Time complexity: O(n log n), due to sorting.
* Space complecity: O(n), for the copied arrays.
*
*Limitation: Sorting adds overhead compared with checking
* arrays that are already sorted.
*/
public static boolean twopointerEqual(int[] first, int[] second) {

   if (first == null || second == null) {
       return first == second;
   }

   if (first.length != second.length) {
       return false;
   }


   int[] sortedFirst = java.util.Arrays.copyOf(first, first.length);
   int[] sortedSecond = java.util.Arrays.copyOf(second, second.length);

   java.util.Arrays.sort(sortedFirst);
   java.util.Arrays.sort(sortedSecond);

   int left = 0;
   int right = 0;

   while (left < sortedFirst.length && right < sortedSecond.length) {

       if (sortedFirst[left] != sortedSecond[right]) {
           return false;
       }

       left++;
       right++;
   }

   return true;

}

}
