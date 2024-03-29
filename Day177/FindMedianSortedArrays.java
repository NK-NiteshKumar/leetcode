class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        int idxNums1 = 0;
        int idxNums2 = 0;

        for (int i = 0; i < mergedArray.length; i++) {
            if (idxNums2 < nums2.length && (idxNums1 == nums1.length || nums2[idxNums2] < nums1[idxNums1])) {
                mergedArray[i] = nums2[idxNums2++];
            } else {
                mergedArray[i] = nums1[idxNums1++];
            }
        }

        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2.0;
        }
    }
}

//https://leetcode.com/problems/median-of-two-sorted-arrays/
