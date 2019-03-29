package easy.m;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class MergeTwoSortedListsTest {

  private MergeTwoSortedLists mergeTwoSortedLists;

  @Before
  public void setUp() {
    mergeTwoSortedLists = new MergeTwoSortedLists();
  }

  @Test
  public void test1MergeTwoLists() {
    ListNodeUtils listNodeUtils = new ListNodeUtils();
    // test input
    ListNode l1 = listNodeUtils.listNode(new int[] {1, 2, 4});
    ListNode l2 = listNodeUtils.listNode(new int[] {1, 3, 4});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 1, 2, 3, 4, 4});

    // perform test
    ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2MergeTwoLists() {
    ListNodeUtils listNodeUtils = new ListNodeUtils();
    // test input
    ListNode l1 = listNodeUtils.listNode(new int[] {-1, 1, 2, 3, 4});
    ListNode l2 = listNodeUtils.listNode(new int[] {1, 3, 4});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {-1, 1, 1, 2, 3, 3, 4, 4});

    // perform test
    ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test3MergeTwoLists() {
    ListNodeUtils listNodeUtils = new ListNodeUtils();
    // test input
    ListNode l1 = listNodeUtils.listNode(new int[] {-1, 1, 2, 3, 4});
    ListNode l2 = null;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {-1, 1, 2, 3, 4});

    // perform test
    ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test4MergeTwoLists() {
    ListNodeUtils listNodeUtils = new ListNodeUtils();
    // test input
    ListNode l1 = null;
    ListNode l2 = listNodeUtils.listNode(new int[] {-1, 1, 2, 3, 4});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {-1, 1, 2, 3, 4});

    // perform test
    ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test5MergeTwoLists() {
    ListNodeUtils listNodeUtils = new ListNodeUtils();
    // test input
    ListNode l1 = null;
    ListNode l2 = null;

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {});

    // perform test
    ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
