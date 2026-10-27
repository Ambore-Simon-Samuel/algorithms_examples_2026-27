package assignment_sheet1;

public class ShortestSubarray {
    /**
     * Finds ths shortest contiguous subarray whose sum is
     * greater than or equal to the target using brute force.
     *
     * @param numbers an array of positive integers
     * @param target the minimum required sum
     * @return the start and end indices, or {0} if none exists
     *
     * Time complexity:
     * outer loop = n iterations
     * Inner loop = at most n iterations.
     * T(n) = n + (n-1) + ... + 1
     *      = n(n+1)/2
     *      = (n^2+n)/2
     *      = O(n^2).
     *
     * Space complexity:
     * uses a fixed number of variables.
     * S(n) = c = O(1).
     *
     * Limitation: Checks many possible subarrays,
     * making it slower for large arrays.
     * Assumes all array values are positive.
     */
    public static int[] bruteForceShortest(int[] numbers, int target) {

        if (numbers == null || target <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int shortest = numbers.length + 1;
        int bestStart = -1;
        int bestEnd = -1;

        for (int start = 0; start < numbers.length; start++) {
            int sum = 0;

            for (int end = start; end < numbers.length; end++) {

                sum += numbers[end];

                if (sum >= target) {
                    int length = end - start + 1;

                    if (length < shortest) {
                        shortest = length;
                        bestStart = start;
                        bestEnd = end;
                    }

                    break;
                }
            }

        }

        if (bestStart == -1) {
            return new int[]{0};
        }

        return new int[]{bestStart, bestEnd};
    }

    /**
     * Finds the shortest contiguous subarray with a sum
     * greater than or equal to the target using a sliding window.
     *
     * @param numbers an array of positive integers
     * @param target the minimum required sum
     * @return start and end indices, or {0} if no solution exists
     *
     * Time complexity:
     * Each element enters the window at most once and
     * leaves the window at most once.
     * T(n) <= n + n = 2n
     * Therefore, O(n).
     *
     * Space complexity:
     * Uses a fixed number of variables.
     * S(n) = c = 0(1).
     *
     * Limitation: Requires positive array values.
     * The sliding-window approach is not reliable for
     * arbitrary array containing negative numbers.
     */
    public static int[] slidingwindowShortest(int[] numbers, int target) {

        if (numbers == null || target <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int left = 0;
        int sum = 0;
        int shortest = numbers.length + 1;
        int bestStart = -1;
        int bestEnd = -1;

        for (int right = 0; right < numbers.length; right++) {

            sum += numbers[right];

            while (sum >= target) {
                int length = right - left + 1;

                if (length < shortest) {
                    shortest = length;
                    bestStart = left;
                    bestEnd = right;
                }

                sum -= numbers[left];
                left++;
            }
        }

        if (bestStart == -1) {
            return new int[]{0};
        }

        return new int[]{bestStart, bestEnd};
    }
}
