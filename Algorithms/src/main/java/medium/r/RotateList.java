package medium.r;

import common.ListNode;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Rotate List (https://leetcode.com/problems/rotate-list/)
 */
public class RotateList {

  // this solution is brilliant
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }

    ListNode tail = head;
    // count length of node
    int length = 1;
    while (tail.next != null) {
      tail = tail.next;
      length++;
    }

    // form a cycle
    tail.next = head;
    k = k % length;
    for (int i = 0; i < length - k; i++) {
      tail = tail.next;
    }

    // rotate
    head = tail.next;
    tail.next = null;
    return head;
  }

  // my own solution
  public ListNode rotateRight2(ListNode head, int k) {
    // create dummy head
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode tail = dummy;

    // count total node - O(n)
    int totalNode = 0;
    while (tail.next != null) {
      tail = tail.next;
      totalNode++;
    }

    // find the index of previous node
    int previousIndex = 0;
    if (totalNode != 0 && k % totalNode != 0) {
      previousIndex = k % totalNode;
      previousIndex = totalNode - previousIndex;
    }

    // find the previous node
    ListNode previous = dummy;
    while (previousIndex > 0) {
      previous = previous.next;
      previousIndex--;
    }

    // point tail's next to head
    tail.next = dummy.next;
    // make the previous node's next to head
    head = previous.next;
    // make previous to tail
    previous.next = null;

    // if nodes are acyclic tail should point to null
    if (tail.next == head) {
      tail.next = null;
    }

    return head;
  }
}
