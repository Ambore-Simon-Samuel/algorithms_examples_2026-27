package assignment_sheet1;

public class TestPalindromeChecker {
    public static void main(String[] args) {
        //Brute-force tests
        System.out.println("Brute-force tests:");

        System.out.println(PalindromeChecker.bruteForcePalindrome("Racecar"));
        System.out.println(PalindromeChecker.bruteForcePalindrome("hello"));
        System.out.println(PalindromeChecker.bruteForcePalindrome("A man, a  plan, a canal: Panama!"));

        //Two-pointer tests
        System.out.println(PalindromeChecker.twoPointerPalindrome("Racecar"));
        System.out.println(PalindromeChecker.twoPointerPalindrome("hello"));
        System.out.println(PalindromeChecker.twoPointerPalindrome("A man, a plan, a canal: Panama!"));

    }
}


