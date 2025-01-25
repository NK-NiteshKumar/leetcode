# 2948. [Make Lexicographically Smallest Array by Swapping Elements](https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/description/?envType=daily-question&envId=2025-01-25)

## Solution

### Approach: Map based

```java
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int len = nums.length;
        if (len == 1) return nums;

        int temp[] = new int[len];
        for (int i = 0; i < len; i++) temp[i] = nums[i];
        Arrays.sort(temp);

        Map<Integer, List<Integer>> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int count = 1;

        for (int i = 0; i < len - 1; i++) {
            map2.put(temp[i], count);
            if (temp[i + 1] - temp[i] <= limit) {
                List<Integer> tempor = map1.getOrDefault(count, new ArrayList<>());
                tempor.add(temp[i]);
                map1.put(count, tempor);
            } else {
                List<Integer> tempor = map1.getOrDefault(count, new ArrayList<>());
                tempor.add(temp[i]);
                map1.put(count, tempor);
                count++;
            }
        }

        if (temp[len - 1] - temp[len - 2] <= limit) {
            List<Integer> tempor = map1.get(count);
            tempor.add(temp[len - 1]);
            map1.put(count, tempor);
        } else {
            List<Integer> tempor = new ArrayList<>();
            tempor.add(temp[len - 1]);
            map1.put(count, tempor);
        }
        map2.put(temp[len - 1], count);

        for (int i = 0; i < len; i++) {
            int val = nums[i];
            int group = map2.get(val);
            List<Integer> tempo = map1.get(group);
            int data = tempo.get(0);
            temp[i] = data;
            tempo.remove(0);
            if (tempo.isEmpty()) map1.remove(group);
            else map1.put(group, tempo);
        }
        return temp;
    }
}

```

### Approach: Pair based

```java
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        class Pair {
            int index, value;
            Pair(int index, int value) {
                this.index = index;
                this.value = value;
            }
        }

        Pair[] pairs = new Pair[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(i, nums[i]);
        }

        Arrays.sort(pairs, (a, b) -> a.value - b.value);

        Pair[] ids = Arrays.copyOf(pairs, n);
        int i = 0;

        while (i < n) {
            int j = i;
            i++;
            while (i < n && pairs[i].value - pairs[i - 1].value <= limit) {
                i++;
            }
            Arrays.sort(ids, j, i, (a, b) -> a.index - b.index);
            for (int k = j; k < i; k++) {
                ans[ids[k].index] = pairs[k].value;
            }
        }

        return ans;
    }
}
```
