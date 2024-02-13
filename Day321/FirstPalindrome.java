public class FirstPalindrome {
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word).reverse();
            if (word.equals(reversed.toString())) {
                return word;
            }
        }
        return "";
    }
}

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
