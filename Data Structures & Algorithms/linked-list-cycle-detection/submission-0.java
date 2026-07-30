/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head){
        ListNode slow=head;               // move one step
        ListNode fast=head;               // move two steps
        while(fast!=null&&fast.next!=null){
            slow=slow.next;               // move slow pointer
            fast=fast.next.next;          // move fast pointer
            if(slow==fast)
                return true;              // cycle detected
        }
        return false;                     // no cycle found

        // slow moves one node at a time.
        // fast moves two nodes at a time.
    }
}
