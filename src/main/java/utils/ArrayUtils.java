package utils;

public class ArrayUtils {

    /**
     * Calculates the average of the numbers in an integer array.
     *
     * @param nums the array of integers to calculate the average of
     * @return the average of the numbers in the array
     */
    public static double calcAverage(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total = total + num;
        }

        return (double) total / nums.length;
    }

    /**
     * Finds the highest number in an integer array.
     *
     * @param nums the array of integers to search
     * @return the highest number in the array
     */
    public static int findMax(int[] nums) {
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

}