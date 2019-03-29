package medium.r;

import common.ListNode;

/**
 * Created by jsong on 2019-03-28.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Remove Nth Node From End of
 *     List(https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */
public class RemoveNthNodeFromEndList {
  public ListNode removeNthFromEnd(ListNode head, int n) {

    if (head == null) {
      return head;
    }

    ListNode indexNode = head;

    int total = getTotal(indexNode);

    int count = total - n;

    if (count < 0) {
      return head;
    } else if (count == 0) {
      return head.next;
    } else {
      indexNode = head;
      for (int i = 0; i < count - 1; i++) {
        indexNode = indexNode.next;
      }
      if (n == 0) {
        indexNode.next = null;
      } else {
        indexNode.next = indexNode.next.next;
      }
    }

    return head;
  }

  private int getTotal(ListNode indexNode) {
    int total = 0;
    while (indexNode != null) {
      indexNode = indexNode.next;
      total++;
    }
    return total;
  }
}
