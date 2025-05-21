package at.fhj.msd;

public class StringUtils {
    /**
     * Checks if a given string is a palindrome.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
       return input.equals(reversed);

    }
}

