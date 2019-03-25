package medium.a;

import common.ListNode;

import java.util.Stack;

/**
 * Created by jsong on 24/03/2019.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Add Two Numbers(https://leetcode.com/problems/add-two-numbers/)
 */
public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode result = null;
    ListNode indexNode = null;
    boolean roundUp = false;
    while (l1 != null || l2 != null) {
      // sum of two numbers
      int val1 = l1 == null ? 0 : l1.val;
      int val2 = l2 == null ? 0 : l2.val;
      int sum = val1 + val2;

      // round up sum if the last sum is equal to or greater than 10
      if (roundUp) {
        sum++;
      }

      // set flag and round down sum if the sum is equal to or greater than 10
      roundUp = sum / 10 > 0;
      if (roundUp) {
        sum = sum % 10;
      }

      // connect nodes
      if (indexNode == null) {
        result = new ListNode(sum);
        indexNode = result;
      } else {
        indexNode.next = new ListNode(sum);
        indexNode = indexNode.next;
      }

      // move to next node
      l1 = l1 == null ? null : l1.next;
      l2 = l2 == null ? null : l2.next;
    }

    // round up if the last sum is equal to or greater than 10
    if (roundUp) {
      indexNode.next = new ListNode(1);
    }

    return result;
  }
}
