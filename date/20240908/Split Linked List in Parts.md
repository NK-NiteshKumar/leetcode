# 725. [Split Linked List in Parts](https://leetcode.com/problems/split-linked-list-in-parts/solutions/?envType=daily-question&envId=2024-09-08)

## Solution

```java
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int partSize = length / k;
        int extra = length % k;

        ListNode[] result = new ListNode[k];
        temp = head;
        for (int i = 0; i < k; i++) {
            result[i] = temp;
            int currentPartSize = partSize + (extra-- > 0 ? 1 : 0);
            for (int j = 0; j < currentPartSize - 1; j++) {
                temp = temp.next;
            }
            if (temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }
        return result;
    }
}
```
