# 2181. [Merge Nodes in Between Zeros](https://leetcode.com/problems/merge-nodes-in-between-zeros/description/?envType=daily-question&envId=2024-07-04)

## Solution

```java
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        ListNode newCur = dummyNode;
        ListNode cur = head;

        while (true) {
            int sum = 0;
            while (cur.next != null && cur.next.val != 0) {
                cur = cur.next;
                sum += cur.val;
            }
            newCur.next = new ListNode(sum);
            newCur = newCur.next;
            cur = cur.next;
            if (cur.next == null) break;
        }

        return dummyNode.next;
    }
}
```
