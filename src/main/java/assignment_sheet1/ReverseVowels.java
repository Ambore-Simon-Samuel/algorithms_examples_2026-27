package assignment_sheet1;

public class ReverseVowels {
    /**
     * Reverse only the vowels in a string using brute force.
     * All consonants and other characters stay in place.
     * @param test the original string
     * @return the string with its vowels reversed
     *
     * Time complexity:
     * Finding vowels takes 0(n).
     * reversing their positions takes 0(n).
     * T(n) = n + n + n = 3n = 0(n).
     *
     * Space complexity:
     * The character array and vowel array each use 0(n).
     * S(n) = n + n = 2n = 0(n).
     *
     * Limitation: Uses extra memory to store vowels.
     * only English vowels (a, e, i, o, u) are recognized.
     */
    public static String bruteForceReverse(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");

        }

        char[] letters = text.toCharArray();
        char[] vowels = new char[letters.length];

        int count = 0;

        // Collect vowels
        for (int i = 0; i < letters.length; i++){
            if (isVowel(letters[i])) {
                vowels[count] = letters[i];
                count++;
            }
        }

        // Put vowels back in reverse order
        int vowelIndex =  count - 1;

        for (int i = 0; i < letters.length; i++) {
            if (isVowel(letters[i])) {
                letters[i] = vowels[vowelIndex];
                vowelIndex--;
            }
        }

        return new String(letters);
    }

    /**
     * checks whether a character is an english vowel.
     */
    private static boolean isVowel(char letter) {
        return  letter == 'a' || letter == 'e' ||
                letter == 'i' || letter == 'o' ||
                letter == 'u' || letter == 'A' ||
                letter == 'E' || letter == 'I' ||
                letter == 'O' || letter == 'U';
    }
}
