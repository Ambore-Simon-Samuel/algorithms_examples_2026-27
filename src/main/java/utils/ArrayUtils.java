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

    /**
     * Finds the most frequent number in an integer array.
     * If multiple numbers have the same frequency, the first one is returned.
     * The array must not be empty.
     *
     * @param nums the array of integers to search
     * @return the most frequent number in the array
     */
    public static int getMostFrequent(int[] nums) {
        int mostFrequent = nums[0];
        int highestFrequency = count(nums, nums[0]);

        for (int num : nums) {
            int frequency = count(nums, num);

            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }

    /**
     * Counts how many numbers in an integer array are greater than a given value.
     *
     * @param nums the array of integers to search
     * @param value the value to compare against
     * @return the number of elements greater than the value
     */
    public static int countGreater(int[] nums, int value) {
        int count = 0;

        for (int num : nums) {
            if (num > value) {
                count++;
            }
        }

        return count;
    }

    /**
     * Counts how many numbers in an integer array are greater than the average.
     *
     * @param nums the array of integers to search
     * @return the number of elements greater than the average
     */
    public static int countGreaterThanAverage(int[] nums) {
        double average = calcAverage(nums);
        int count = 0;

        for (int num : nums) {
            if (num > average) {
                count++;
            }
        }

        return count;
    }
}