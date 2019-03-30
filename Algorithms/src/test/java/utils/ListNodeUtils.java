package utils;

import common.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ListNodeUtils {

  public void assertListNode(ListNode expected, ListNode actual) {
    while (expected != null && actual != null) {
      assertEquals(expected.val, actual.val);

      expected = expected.next;
      actual = actual.next;
    }
    assertNull(expected);
    assertNull(actual);
  }

  public ListNode listNode(int[] vals) {
    ListNode firstNode = null;
    ListNode indexNode = null;
    for (int i = 0; i < vals.length; i++) {
      if (i == 0) {
        firstNode = indexNode = new ListNode(vals[i]);
      } else {
        indexNode.next = new ListNode(vals[i]);
        indexNode = indexNode.next;
      }
    }
    return firstNode;
  }

  public ListNode[] listNodes(int[][] vals) {
    ListNode[] lists = new ListNode[vals.length];
    ListNode firstNode = null;
    ListNode indexNode = null;
    for (int i = 0; i < vals.length; i++) {
      for(int j = 0; j < vals[i].length; j++)
      if (j == 0) {
        firstNode = indexNode = new ListNode(vals[i][j]);
      } else {
        indexNode.next = new ListNode(vals[i][j]);
        indexNode = indexNode.next;
      }
      lists[i] = firstNode;
    }
    return lists;
  }
}
