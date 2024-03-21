class ReverseList {
    public ListNode one;
    public ListNode two;
    public ListNode three;
    public ListNode reverseList(ListNode head) {
        one=null;
        two=head;
     return reccurencesearch(one,two);     
    }
    public ListNode reccurencesearch(ListNode one,ListNode two){       
        if(two ==null){
            return one; 
        }
        three=two.next;
        two.next=one;
        return reccurencesearch(two,three);     
    }    
}

//https://leetcode.com/problems/reverse-linked-list/
