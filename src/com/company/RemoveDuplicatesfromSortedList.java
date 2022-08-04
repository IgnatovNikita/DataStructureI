package com.company;
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
// Return the linked list sorted as well.
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode nextNode = head;

        while (nextNode.next != null){
            if (nextNode.val == nextNode.next.val) nextNode.next = nextNode.next.next;
            else nextNode = nextNode.next;
        }

        return head;
    }
}
