package assignment_sheet1;

public class TestShortestSubarray {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int[] result = ShortestSubarray.bruteForceShortest(numbers, target);

        System.out.println("Brute-force shortest subarray:");
        System.out.println("Start index:" + result[0]);
        System.out.println("End index:" + result[1]);

        //second test: sliding-window method
        int[] slidingResult = ShortestSubarray.slidingwindowShortest(numbers, target);

        System.out.println("Sliding-window shortest subarray:");
        System.out.println("Start index: " + slidingResult[0]);
        System.out.println("End index: " + slidingResult[1]);

        //third test: no solution exsists

        int[] noSolution = {1, 2, 3};

        int[] bruteNoSolution =  ShortestSubarray.bruteForceShortest(noSolution, 20);
        int[] slidingNoSolution =  ShortestSubarray.slidingwindowShortest(noSolution, 20);

        System.out.println("Brute-force no solution: " + bruteNoSolution[0]);
        System.out.println("Sliding-window no solution: " + slidingNoSolution[0]);
    }
}
