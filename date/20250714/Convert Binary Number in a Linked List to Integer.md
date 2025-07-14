# 1290. [Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/?envType=daily-question&envId=2025-07-14)

## Solution

```java
class Solution {
    public int getDecimalValue(ListNode head) {
        int ans=0;

        while(head != null){
            int data = head.val;
            ans = ans*2 + data;
            head = head.next;
        }

        return ans;
    }
}
```
