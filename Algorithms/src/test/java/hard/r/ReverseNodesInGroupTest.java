package hard.r;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class ReverseNodesInGroupTest {

  private ReverseNodesInGroup reverseNodesInGroup;
  private ListNodeUtils listNodeUtils;

  @Before
  public void setUp() {
    reverseNodesInGroup = new ReverseNodesInGroup();
    listNodeUtils = new ListNodeUtils();
  }

  @Test
  public void test1ReverseKGroup() {
    // test inputs
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
    int k = 3;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {3, 2, 1, 6, 5, 4, 7, 8});

    // perform test
    ListNode actual = reverseNodesInGroup.reverseKGroup(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2ReverseKGroup() {
    // test inputs
    ListNode head = listNodeUtils.listNode(new int[] {});
    int k = 0;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = reverseNodesInGroup.reverseKGroup(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test3ReverseKGroup() {
    // test inputs
    ListNode head = listNodeUtils.listNode(new int[] {});
    int k = 1;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = reverseNodesInGroup.reverseKGroup(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test4ReverseKGroup() {
    // test inputs
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});
    int k = 3;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {3, 2, 1, 4, 5});

    // perform test
    ListNode actual = reverseNodesInGroup.reverseKGroup(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
