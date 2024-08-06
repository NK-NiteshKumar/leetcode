# 3016. [Minimum Number of Pushes to Type Word II](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/description/?envType=daily-question&envId=2024-08-06)

## Solution

```java
class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        maxHeap.addAll(map.entrySet());
        int count = 0;
        for(int j=1; j <= map.size(); j++){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            if (j <= 8)
                count += entry.getValue();
            else if(j > 8 && j <= 16)
                count += entry.getValue()*2;
            else if(j > 16 && j <= 24)
                count += entry.getValue()*3;
            else
            count += entry.getValue()*4;
        }
        return count;
    }
}
```
### Better Approach
```java
class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);
        int i=25;
        int count = 0;
        int start = 1;
        int ans =0;
        while( i >= 0 && arr[i] != 0){
            ans+=(start * arr[i]);
            count++;
            if(count == 8){ 
                start++;
                count = 0;
            }
            i--;
        }
        return ans;
    }
}
```
