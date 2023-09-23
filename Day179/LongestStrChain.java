class LongestStrChain {
    private Map<String, Integer> chainLengths = new HashMap<>();
    private Map<String, Boolean> wordSet = new HashMap<>();

    private int calculateChainLength(String word) {
        if (!wordSet.containsKey(word) || !wordSet.get(word))
            return 0;

        if (chainLengths.containsKey(word))
            return chainLengths.get(word);

        int chainLength = 1;

        for (int i = 0; i < word.length(); i++) {
            String newWord = word.substring(0, i) + word.substring(i + 1);
            chainLength = Math.max(chainLength, 1 + calculateChainLength(newWord));
        }

        chainLengths.put(word, chainLength);
        return chainLength;
    }

    public int longestStrChain(String[] words) {
        for (String word : words) {
            wordSet.put(word, true);
        }

        int maxChainLength = -1;

        for (String word : words) {
            maxChainLength = Math.max(maxChainLength, calculateChainLength(word));
        }

        return maxChainLength;
    }
}

//https://leetcode.com/problems/longest-string-chain/
