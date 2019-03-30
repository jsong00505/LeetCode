package medium.s;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class SwapNodesInPairsTest {

  private SwapNodesInPairs swapNodesInPairs;
  private ListNodeUtils listNodeUtils;

  @Before
  public void setUp() {
    swapNodesInPairs = new SwapNodesInPairs();
    listNodeUtils = new ListNodeUtils();
  }

  @Test
  public void test1SwapPairs() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {2, 1, 4, 3});

    // perform test
    ListNode actual = swapNodesInPairs.swapPairs(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2SwapPairs() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = swapNodesInPairs.swapPairs(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
