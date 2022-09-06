package LinkedList;

public class RemoveLinkedListElements {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        // Sentinel Node starts at -1 position;
        ListNode sentinel = new ListNode(0);
        // Point Sentinel.next at head;
        sentinel.next = head;
        // Node to point at sentinel
        ListNode prev = sentinel;
        // Node to point at head;
        ListNode curr = head;
        // loop through list until the end is reached
        while (curr != null) {
            // if the current value == the target value,
            // increment the prev.next (curr node is always incremented)
            if (curr.val == val) {
                prev.next = curr.next;
            }
            // if the current value !- target value,
            // update the prev node to equal the current node
            else {
                prev = curr;
            }
            // always increment the current node
            curr = curr.next;
        }
        // return sentinel.next (head pointer)
        return sentinel.next;
    }
}
