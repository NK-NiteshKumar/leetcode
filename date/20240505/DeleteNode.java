class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

//https://leetcode.com/problems/delete-node-in-a-linked-list/
