package com.company;
/*Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
and return the new head.*/
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) head = head.next;

        if (head == null) return null;
        if (head.next != null) {
            ListNode oldNode = head;
            ListNode newNode = oldNode.next;
            while (oldNode != null && newNode != null) {
                if (newNode.val == val) {
                    newNode = newNode.next;
                    oldNode.next = newNode;
                } else {
                    oldNode = oldNode.next;
                    newNode = newNode.next;
                }
            }
        }
        return head;
    }
}
