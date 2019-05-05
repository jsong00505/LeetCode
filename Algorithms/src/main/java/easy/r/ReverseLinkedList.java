package easy.r;

import common.ListNode;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Reverse Linked List (https://leetcode.com/problems/reverse-linked-list/)
 */
public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    boolean recursive = true;

    if (recursive) {
      return recursiveHelper(head);
    } else {
      return iterativeHelper(null, head);
    }
  }

  private ListNode iterativeHelper(ListNode prev, ListNode cur) {
    while (cur != null) {
      ListNode temp = prev;
      prev = cur;
      cur = cur.next;
      prev.next = temp;
    }
    return prev;
  }

  private ListNode recursiveHelper(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode temp = recursiveHelper(head.next);
    head.next.next = head;
    head.next = null;
    return temp;
  }
}
