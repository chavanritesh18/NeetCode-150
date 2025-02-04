class Solution {
    public boolean isPalindrome(String s) {

        // Initialize two pointers: one at the start and one at the end of the string
        int start  = 0, end  =  s.length() - 1;

        // Continue checking until the two pointers meet or cross each other
        while (start < end) {

            // Skip non-alphanumeric characters from the start of the string
            while (start < end && !isAlphaNum(s.charAt(start))) {
                start++;
            }

            // Skip non-alphanumeric characters from the end of the string
            while (end > start && !isAlphaNum(s.charAt(end))) {
                end--;
            }

            // If the characters at the current positions don't match (ignoring case), return false
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            // Move the pointers inward
            start++;
            end--;
        }

        // If the loop completes, all corresponding characters match, so it's a palindrome
        return true;
    }

    // Helper method to check if a character is alphanumeric
    public boolean isAlphaNum(char ch) {
        // Check if the character is either a letter (upper or lowercase) or a digit
        return (ch >= 'A' && ch <= 'Z' || 
                ch >= 'a' && ch <= 'z' ||
                ch >= '0' && ch <= '9');
    }
}
