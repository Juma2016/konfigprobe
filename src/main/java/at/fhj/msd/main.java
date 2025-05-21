package at.fhj.msd;


public class main {
    /**
     * Main method to demonstrate the palindrome check.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String word = "madam";
        if (StringUtils.isPalindrome(word)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
