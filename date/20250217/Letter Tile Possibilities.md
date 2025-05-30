# 1079. [Letter Tile Possibilities](https://leetcode.com/problems/letter-tile-possibilities/description/?envType=daily-question&envId=2025-02-17)

## Solution

```java
class Solution {
    Set<String> all = new HashSet<>();

    public int numTilePossibilities(String tiles) {
        boolean[] visited = new boolean[tiles.length()];
        backtrack(tiles, "", visited);
        return all.size();
    }

    private void backtrack(String tiles, String word, boolean[] visited) {
        for (int i = 0; i < tiles.length(); i++) {
            if (visited[i]) continue;
            String charSequence = word + tiles.charAt(i);
            visited[i] = true;
            all.add(charSequence);
            backtrack(tiles, charSequence, visited);
            visited[i] = false;
        }
    }
}
```
