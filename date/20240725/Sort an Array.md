# 912. [Sort an Array](https://leetcode.com/problems/sort-an-array/description/?envType=daily-question&envId=2024-07-25)

## Solution

```java
class Solution {
    public int[] sortArray(int[] nums) {
        int[] counting = new int[2 * 50000 + 1];
        for (int num : nums) {
            counting[num + 50000]++;
        }
        int writeInd = 0;
        for (int numberInd = 0; numberInd < counting.length; numberInd++) {
            int freq = counting[numberInd];
            while (freq != 0) {
                nums[writeInd] = numberInd - 50000;
                writeInd++;
                freq--;
            }
        }
        return nums;
    }
}
```
