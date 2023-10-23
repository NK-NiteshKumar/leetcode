class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode temp = dummy;
        while(temp.next!=null){
            len++;
            temp = temp.next;
        }
        
        temp = dummy;

        while(temp.next!=null){
            if(len<k) break;
            int count = k-1;    
            ListNode tempnext = temp.next;
            ListNode first = temp.next;
            ListNode second = first.next;

            while(count-- > 0){
                ListNode nex = second.next;
                second.next = first;
                first = second;
                second = nex;
            }
            len = len - k;  

            temp.next = first;
            tempnext.next = second;
            temp = tempnext;

        }

        return dummy.next;   
    }
}

//https://leetcode.com/problems/reverse-nodes-in-k-group/
