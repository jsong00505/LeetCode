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
}
