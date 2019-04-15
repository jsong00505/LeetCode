package medium.r;

import common.ListNode;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Remove Duplicates from Sorted List II
 *     (https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)
 */
public class RemoveDuplicatesFromSortedListTwo {

  // recursion
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }

    if (head.next != null && head.val == head.next.val) {
      while (head.next != null && head.val == head.next.val) {
        head = head.next;
      }
      return deleteDuplicates(head.next);
    } else {
      head.next = deleteDuplicatesByIteration(head.next);
    }
    return head;
  }

  // iteration
  public ListNode deleteDuplicatesByIteration(ListNode head) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode previous = dummy;
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.val == current.next.val) {
        int duplicate = current.val;
        while (current.next != null && current.next.val == duplicate) {
          current = current.next;
        }
        previous.next = current.next;
      } else {
        previous = current;
      }
      current = current.next;
    }
    return dummy.next;
  }
}
