package medium.r;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class RemoveDuplicatesFromSortedListTwoTest {

  private RemoveDuplicatesFromSortedListTwo removeDuplicatesFromSortedListTwo;
  private ListNodeUtils listNodeUtils;

  @Before
  public void setUp() {
    removeDuplicatesFromSortedListTwo = new RemoveDuplicatesFromSortedListTwo();
    listNodeUtils = new ListNodeUtils();
  }

  @Test
  public void test1DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 2, 3, 3, 4, 4, 5});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 2, 5});

    // perform test
    ListNode actual = removeDuplicatesFromSortedListTwo.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 1, 1, 2, 3});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {2, 3});

    // perform test
    ListNode actual = removeDuplicatesFromSortedListTwo.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test3DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1});

    // perform test
    ListNode actual = removeDuplicatesFromSortedListTwo.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test4DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 1});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = removeDuplicatesFromSortedListTwo.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test5DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = removeDuplicatesFromSortedListTwo.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
