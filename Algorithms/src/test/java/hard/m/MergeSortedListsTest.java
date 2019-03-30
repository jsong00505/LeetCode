package hard.m;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;
import utils.ListNodeUtils;

public class MergeSortedListsTest {

  private MergeSortedLists mergeSortedLists;
  private ListNodeUtils listNodeUtils;

  @Before
  public void setUp() {
    mergeSortedLists = new MergeSortedLists();
    listNodeUtils = new ListNodeUtils();
  }

  @Test
  public void test1MergeKLists() {
    // test input
    ListNode[] lists = listNodeUtils.listNodes(new int[][] {{1, 4, 5}, {1, 3, 4}, {2, 6}});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 1, 2, 3, 4, 4, 5, 6});

    // perform test
    ListNode actual = mergeSortedLists.mergeKLists(lists);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }

  @Test
  public void test2MergeKLists() {
    // test input
    ListNode[] lists = listNodeUtils.listNodes(new int[][] {{1}, {1, 3, 4}, {2, 6}});

    // set expected value
    ListNode expected = listNodeUtils.listNode(new int[] {1, 1, 2, 3, 4, 6});

    // perform test
    ListNode actual = mergeSortedLists.mergeKLists(lists);

    // assertion
    listNodeUtils.assertListNode(expected, actual);
  }
}
