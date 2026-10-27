package assignment_sheet1;

public class TestShortestSubarray {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int[] result = ShortestSubarray.bruteForceShortest(numbers, target);

        System.out.println("Brute-force shortest subarray:");
        System.out.println("Start index:" + result[0]);
        System.out.println("End index:" + result[1]);
    }
}
