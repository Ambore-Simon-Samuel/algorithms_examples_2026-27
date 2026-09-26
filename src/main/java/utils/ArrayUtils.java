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

    /**
     * Finds the lowest number in an integer array.
     *
     * @param nums the array of integers to search
     * @return the lowest number in the array
     */
    public static int findMin(int[] nums) {
        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    /**
     * Counts how many times a value appears in an integer array.
     *
     * @param nums the array of integers to search
     * @param value the value to count
     * @return the number of times the value appears
     */
    public static int count(int[] nums, int value) {
        int count = 0;

        for (int num : nums) {
            if (num == value) {
                count++;
            }
        }

        return count;
    }
}