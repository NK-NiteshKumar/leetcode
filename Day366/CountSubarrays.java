public class CountSubarrays {
    public long countSubarrays(int[] nums, int k) {
        long subarrayCount = 0;
        long maxElementCount = 0;
        int arraySize = nums.length;
        int maxElement = Arrays.stream(nums).max().getAsInt();
        int windowStart = 0;

        for (int i = 0; i < arraySize; i++) {
            if (nums[i] == maxElement) {
                maxElementCount++;

                if (maxElementCount == k) {
                    long subarraysWithMax = arraySize - i;
                    while (nums[windowStart] != maxElement) {
                        windowStart++;
                        subarrayCount += subarraysWithMax;
                    }
                    subarrayCount += subarraysWithMax;
                    windowStart++;
                    maxElementCount--;
                }
            }
        }
        return subarrayCount; 
    }
}

//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/
