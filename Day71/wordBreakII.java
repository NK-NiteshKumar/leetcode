class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> results = new LinkedList<>();
        StringBuilder tempHolder = new StringBuilder();
        findNextWord(results, tempHolder, s, wordDict, 0);
        return results;
    }

    private void findNextWord(List<String> results, StringBuilder tempHolder, String s, List<String> wordDict, int start) {
        if (start == s.length()) {
            results.add(tempHolder.toString().trim());
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String word = s.substring(start, end + 1);
            if (wordDict.contains(word)) {
                tempHolder.append(word + " ");
                findNextWord(results, tempHolder, s, wordDict, end + 1);
                tempHolder.delete(tempHolder.length() - word.length() - 1, tempHolder.length());
            }
        }
        return;
    }
}

//https://leetcode.com/problems/word-break-ii/
