package com.company;
/*Given head, the head of a linked list, determine if the linked list has a cycle in it.

        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
        following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
        is connected to. Note that pos is not passed as a parameter.

        Return true if there is a cycle in the linked list. Otherwise, return false.

 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null || head.next.next == null) return false;
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow != fast){
            if (slow.next == null || fast.next.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
