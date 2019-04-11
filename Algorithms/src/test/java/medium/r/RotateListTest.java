package medium.r;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class RotateListTest {

  private RotateList rotateList;
  private ListNodeUtils listNodeUtils;

  @Before
  public void setUp() {
    rotateList = new RotateList();
    listNodeUtils = new ListNodeUtils();
  }

  @Test
  public void test1RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});
    int k = 2;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {4, 5, 1, 2, 3});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});
    int k = 5;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test4RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});
    int k = 7;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {4, 5, 1, 2, 3});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test5RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});
    int k = 12;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {4, 5, 1, 2, 3});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test6RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});
    int k = 0;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 2, 3, 4, 5});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test7RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {0, 1, 2});
    int k = 4;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {2, 0, 1});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test8RotateRight() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {});
    int k = 4;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = rotateList.rotateRight(head, k);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
