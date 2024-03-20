class MergeInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        dummy.next = list1;
        
        ListNode current = dummy;
        for (int i = 0; i < a; i++) {
            current = current.next;
        }
        
        ListNode beforeA = current;
        
        for (int i = a; i <= b; i++) {
            current = current.next;
        }
        
        ListNode afterB = current.next;
        
        beforeA.next = list2;
        
        while (list2.next != null) {
            list2 = list2.next;
        }
        
        list2.next = afterB;
        
        return dummy.next;
    }
}

//https://leetcode.com/problems/merge-in-between-linked-lists/
