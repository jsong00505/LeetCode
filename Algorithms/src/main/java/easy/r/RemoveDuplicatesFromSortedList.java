package easy.r;

import common.ListNode;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Remove Duplicates from Sorted List
 *     (https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */
public class RemoveDuplicatesFromSortedList {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }

    if (head.next != null && head.val == head.next.val) {
      ListNode current = head.next;
      while (current.next != null && current.val == current.next.val) {
        current = current.next;
      }
      head.next = deleteDuplicates(current.next);
    } else {
      head.next = deleteDuplicates(head.next);
    }
    return head;
  }
}
