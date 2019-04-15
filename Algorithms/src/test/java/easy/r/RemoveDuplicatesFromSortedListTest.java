package easy.r;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class RemoveDuplicatesFromSortedListTest {

  private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;
  private ListNodeUtils listNodeUtils;

  @Before
  public void setUp() {
    removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    listNodeUtils = new ListNodeUtils();
  }

  @Test
  public void test1DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 1, 2});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 2});

    // perform test
    ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 1, 2, 3, 3});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 2, 3});

    // perform test
    ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

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
    ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test4DeleteDuplicates() {
    // test input
    ListNode head = listNodeUtils.listNode(new int[] {1, 1, 1, 1});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1});

    // perform test
    ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

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
    ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
