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
// https://leetcode.com/problems/reverse-linked-list/description/
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }

        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode head2 = stack.pop();
        ListNode current2 = newHead;
        while(!stack.isEmpty()){
            current2.next = stack.pop();
            current2 = current2.next;
        }

        current2a.next = null;
        return head2;
    }
}