package solutions.reverse_linked_list;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode reference = head;
        while (reference.next != null) {
            ListNode newHead = reference.next;
            reference.next = newHead.next;
            // ------
            newHead.next = head;
            head = newHead;
        }
        return head;

    }
}
