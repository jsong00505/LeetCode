package hard.r;

import common.ListNode;

import java.util.Stack;

/**
 * Created by jsong on 2019-03-29.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Reverse Nodes in k-Group
 *     (https://leetcode.com/problems/reverse-nodes-in-k-group/)
 */
public class ReverseNodesInGroup {
  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;
    while (current != null) {
      // save the first node of the next batch
      ListNode last = current;

      for (int i = 0; i < k; i++) {
        if (last.next != null) {
          last = last.next;
        } else {
          return dummy.next;
        }
      }

      current = reverse(current, current.next, last, k);
    }
    return dummy.next;
  }

  private ListNode reverse(ListNode first, ListNode current, ListNode last, int k) {

    if (current == null) {
      return current;
    }

    ListNode nextBatchNode = last.next;
    first.next = last;
    Stack<ListNode> stack = new Stack<>();

    int i = 0;
    while (i < k && current != null) {
      stack.push(current);
      current = current.next;
      i++;
    }

    current = stack.pop();
    while (!stack.isEmpty()) {
      ListNode node = stack.pop();
      current.next = node;
      current = node;
    }
    current.next = nextBatchNode;
    return current;
  }
}
