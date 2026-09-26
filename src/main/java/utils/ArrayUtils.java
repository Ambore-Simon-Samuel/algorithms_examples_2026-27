package utils;

public class ArrayUtils {

    public static double calcAverage(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total = total + num;
        }

        return (double) total / nums.length;
    }

}