public class LongestPalindrome {
    public String longestPalindrome(String s) {
        StringBuilder processedStr = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            processedStr.append(c).append("#");
        }
        processedStr.append("$");
        String modifiedString = processedStr.toString();

        int strLength = modifiedString.length();
        int[] palindromeLengths = new int[strLength];
        int center = 0; 
        int rightEdge = 0; 

        for (int i = 1; i < strLength - 1; i++) {
            palindromeLengths[i] = (rightEdge > i) ? Math.min(rightEdge - i, palindromeLengths[2 * center - i]) : 0;
            
            while (modifiedString.charAt(i + 1 + palindromeLengths[i]) == modifiedString.charAt(i - 1 - palindromeLengths[i])) {
                palindromeLengths[i]++;
            }
            
            if (i + palindromeLengths[i] > rightEdge) {
                center = i;
                rightEdge = i + palindromeLengths[i];
            }
        }

        int maxLength = 0;
        int maxCenter = 0;
        for (int i = 0; i < strLength; i++) {
            if (palindromeLengths[i] > maxLength) {
                maxLength = palindromeLengths[i];
                maxCenter = i;
            }
        }
        
        int start = (maxCenter - maxLength) / 2;
        int end = start + maxLength;

        return s.substring(start, end);
    }
}

//https://leetcode.com/problems/longest-palindromic-substring/
