package assignment_sheet1;

public class PalindromeChecker {
    /**
     * checks wheather a string is a palindrome using brute force.
     * ignores capitalization, spaace, and punctutation
     *
     * @param text the string to check; must not be null
     * @return true if the cleaned string is a palindrome;
     *             otherwise false
     * @throws IllegalArgumentException if the text is null
     *                                  <p>
     *                                  Time complexity: O(n), for cleaning, reversing,
     *                                  and comparing the characters.
     *                                  Space complexity: O(n), for the character arrays.
     *                                  <p>
     *                                  Limitation: Creates additional arrays rather than
     *                                  comparing characters directly in the original string.
     */
    public static boolean bruteForcePalindrome(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                cleaned.append(Character.toLowerCase(current));
            }
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed.append(cleaned.charAt(i));
        }

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != reversed.charAt(i)) {
                return false;
            }
        }

        return true;

    }

    /**
     * checks wheather  string is  a palindrome using pointers.
     * Ignores capitalization, spaces, and punctuation.
     *
     * @param text the string to check; must not be null
     * @return true if the text is a palindrome; otherwise false
     * @throws IllegalArgumentException if text is null
     *
     * Time complexity: O(n), because the pointers were inward.
     * Space complexity: O(1), using a fixed number of variables.
     *
     * Limitation: uses  java's character case conversion rules.
     */
    public static boolean twoPointerPalindrome(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            char leftChar = text.charAt(left);
            char rightChar = text.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;

            }

            if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

}

