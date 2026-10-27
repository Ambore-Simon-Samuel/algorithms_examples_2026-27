package assignment_sheet1;

public class TestReverseVowels {
    public static void main(String[] args) {

        System.out.println("Brute-force tests:");

        System.out.println(ReverseVowels.bruteForceReverse("hello"));
        System.out.println(ReverseVowels.bruteForceReverse("leetcode"));
        System.out.println(ReverseVowels.bruteForceReverse("AEIOU"));

        System.out.println("Two-pointer tests:");
        System.out.println(ReverseVowels.twoPointerReverse("hello"));
        System.out.println(ReverseVowels.twoPointerReverse("leetcode"));
        System.out.println(ReverseVowels.twoPointerReverse("AEIOU"));


    }
}
