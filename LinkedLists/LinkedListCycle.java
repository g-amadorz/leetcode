package LinkedLists;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        System.out.println();
        ListNode current = head;
        while(current != null) {
            if (seen.contains(current)) {
                return true;
            } else {
                seen.add(current);
                current = current.next;
            }     
        }
        return false;
    }
}




