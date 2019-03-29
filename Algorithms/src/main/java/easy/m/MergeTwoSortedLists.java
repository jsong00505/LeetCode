package easy.m;

import common.ListNode;

/**
 * Created by jsong on 2019-03-28.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Merge Two Sorted Lists (https://leetcode.com/problems/merge-two-sorted-lists/)
 */
public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode head = new ListNode(0);
    ListNode indexHead = head;
    while (l1 != null && l2 != null) {
      if (l1.val > l2.val) {
        indexHead.next = new ListNode(l2.val);
        l2 = l2.next;
      } else {
        indexHead.next = new ListNode(l1.val);
        l1 = l1.next;
      }
      indexHead = indexHead.next;
    }

    while (l1 != null) {
      indexHead.next = new ListNode(l1.val);
      indexHead = indexHead.next;
      l1 = l1.next;
    }

    while (l2 != null) {
      indexHead.next = new ListNode(l2.val);
      indexHead = indexHead.next;
      l2 = l2.next;
    }

    head = head.next;

    return head;
  }
}
