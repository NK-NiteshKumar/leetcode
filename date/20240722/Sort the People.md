# 2418. [Sort the People](https://leetcode.com/problems/sort-the-people/solutions/?envType=daily-question&envId=2024-07-22)

## Solution

```java
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int numOfPeople = names.length;

        TreeMap<Integer, String> heightToNameMap = new TreeMap<>();

        for(int i = 0; i < numOfPeople; i++) {
            heightToNameMap.put(heights[i], names[i]);
        }

        String sortedNames[] = new String[numOfPeople];

        int curr = numOfPeople - 1;

        for(int height : heightToNameMap.keySet()) {
            sortedNames[curr] = heightToNameMap.get(height);
            curr--;
        }
        return sortedNames;
    }
}
```
