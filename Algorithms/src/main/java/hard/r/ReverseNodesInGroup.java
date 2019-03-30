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

    // create dummy header
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;

    while (current != null) {
      // point to last
      ListNode last = current;
      for (int i = 0; i < k; i++) {
        if (last.next != null) {
          last = last.next;
        } else {
          return dummy.next;
        }
      }

      // reverse current batch
      current = reverse(current, current.next, last, k);
    }
    return dummy.next;
  }

  private ListNode reverse(ListNode first, ListNode current, ListNode last, int k) {

    // avoid stack empty exception
    if (current == null) {
      return current;
    }

    // save the start node of the next batch
    ListNode nextBatchNode = last.next;

    // unlink 1 to 2 and link 1 to last
    first.next = last;
    Stack<ListNode> stack = new Stack<>();

    // push the nodes into stack
    int i = 0;
    while (i < k && current != null) {
      stack.push(current);
      current = current.next;
      i++;
    }

    // reverse each nodes by pop in stack
    current = stack.pop();
    while (!stack.isEmpty()) {
      ListNode node = stack.pop();
      current.next = node;
      current = node;
    }

    // link the last to the first node of the next batch
    current.next = nextBatchNode;

    return current;
  }
}
