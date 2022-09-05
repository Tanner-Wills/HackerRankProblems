package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {

    class ListNode {
        int val;
        MiddleOfLinkedList.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while(head != null) {
            nodes.add(head);
            head = head.next;
        }
        int middle = (nodes.size())/2;
        return nodes.get(middle);
    }

}
