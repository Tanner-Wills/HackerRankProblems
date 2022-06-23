package Recursion;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeTwoSortedLists {

    public static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list11 = new ListNode(2);
        ListNode list111 = new ListNode(4);
        list1.next = list11;
        list11.next = list111;

        ListNode list2 = new ListNode(1);
        ListNode list22 = new ListNode(3);
        ListNode list222 = new ListNode(4);
        list2.next = list22;
        list22.next = list222;

        ListNode solution = mergeTwoLists(list1,list2);

        while(solution != null) {
            System.out.println(solution.val + ", ");
            solution = solution.next;
        }

        System.out.println(solution);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // recursive solution
        // 1. check if the current node of either list is null
        // 2. if only one node is null, add the other node to the list.
        // 3. if both nodes are null, return (Basecase)
        // 4. if neither is null, compare the two and add the smaller node
        // 5. only index the node that got used, keep the other node in the same position.

        ListNode tmp = new ListNode(0);
        ListNode start = tmp;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                tmp.next = new ListNode(list2.val);
                tmp = tmp.next;
                list2 = list2.next;
            } else if (list2 == null) {
                tmp.next = new ListNode(list1.val);
                tmp = tmp.next;
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    tmp.next = new ListNode(list1.val);
                    tmp = tmp.next;
                    list1 = list1.next;
                } else {
                    tmp.next = new ListNode(list2.val);
                    tmp = tmp.next;
                    list2 = list2.next;
                }
            }
        }

        return start.next;
    }
}
