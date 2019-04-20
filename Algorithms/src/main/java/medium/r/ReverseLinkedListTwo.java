package medium.r;

import common.ListNode;

/**
 * Created by jsong on 2019-04-19.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Reverse Linked List II
 *     (https://leetcode.com/problems/reverse-linked-list-ii/)
 */
public class ReverseLinkedListTwo {
  ListNode headPointer;
  ListNode tailPointer;

  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    head = dummy;
    backTracking(head, head.next, 1, m, n);
    return head.next;
  }

  private void backTracking(ListNode prev, ListNode cur, int index, int m, int n) {
    if (index < m) {
      backTracking(prev.next, cur.next, index + 1, m, n);
    } else if (index == m) {
      headPointer = prev;
      tailPointer = cur;
      backTracking(prev.next, cur.next, index + 1, m, n);
    } else if (index <= n) {
      backTracking(prev.next, cur.next, index + 1, m, n);
      cur.next = prev;
    } else if (index == n + 1) {
      headPointer.next = prev;
      tailPointer.next = cur;
    }
  }
}
