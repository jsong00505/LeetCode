package medium.p;

import common.ListNode;

/**
 * Created by jsong on 2019-04-16.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Partition List (https://leetcode.com/problems/partition-list/)
 */
public class PartitionList {
  public ListNode partition(ListNode head, int x) {
    ListNode before = new ListNode(0);
    ListNode beforeHead = before;
    ListNode after = new ListNode(0);
    ListNode afterHead = after;
    while (head != null) {
      if (head.val < x) {
        before.next = head;
        before = before.next;
        head = head.next;
        before.next = null;
      } else {
        after.next = head;
        after = after.next;
        head = head.next;
        after.next = null;
      }
    }
    before.next = afterHead.next;
    return beforeHead.next;
  }
}
