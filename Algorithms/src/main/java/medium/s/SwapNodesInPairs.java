package medium.s;

import common.ListNode;

/**
 * Created by jsong on 2019-03-29.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Swap Nodes In Pairs (https://leetcode.com/problems/swap-nodes-in-pairs/)
 */
public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {

    boolean odd = false;

    // make dummy in the front so node will look like
    // dummy - node(1) - node(2) - node(3) - ...
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode tail = dummy;
    while (tail.next != null && tail.next.next != null) {
      /* do swap when it is odd in order
       * step0) node(1) - node(2) - node(3) - node(4)
       * step1) unlink 1 to 2 and link 1 to 3
       *        node(1) ----------- node(3) - node(4)
       *                  node(2) ----l
       * step2) unlink 2 to 3 and link 2 to 4
       *        node(1) ----------- node(3) - node(4)
       *                  node(2) --------------l
       * step3) unlink 3 to 4 and link 3 to 2
       *        node(1) - node(3)             node(4)
       *                    |----- node(2) -----|
       */
      ListNode next = tail.next;
      ListNode secondNext = tail.next.next;
      tail.next = next.next;
      next.next = secondNext.next;
      secondNext.next = next;

      tail = tail.next.next;
    }
    return dummy.next;
  }
}
