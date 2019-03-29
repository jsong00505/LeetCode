package medium.r;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNthNodeFromEndListTest {

  private RemoveNthNodeFromEndList removeNthNodeFromEndList;

  @Before
  public void setUp() {
    removeNthNodeFromEndList = new RemoveNthNodeFromEndList();
  }

  @Test
  public void test1RemoveNthFromEnd() {
    // input test
    ListNode head = new ListNode(1);
    add(head, 2);
    add(head, 3);
    add(head, 4);
    add(head, 5);
    int n = 2;

    // set expected value
    ListNode expected = new ListNode(1);
    add(expected, 2);
    add(expected, 3);
    add(expected, 5);

    // perform test
    ListNode actual = removeNthNodeFromEndList.removeNthFromEnd(head, n);

    assertListNode(expected, actual);
  }

  @Test
  public void test2RemoveNthFromEnd() {
    // input test
    ListNode head = new ListNode(1);
    int n = 0;

    // set expected value
    ListNode expected = new ListNode(1);

    // perform test
    ListNode actual = removeNthNodeFromEndList.removeNthFromEnd(head, n);

    assertListNode(expected, actual);
  }

  @Test
  public void test3RemoveNthFromEnd() {
    // input test
    ListNode head = null;
    int n = 0;

    // set expected value
    ListNode expected = null;

    // perform test
    ListNode actual = removeNthNodeFromEndList.removeNthFromEnd(head, n);

    assertListNode(expected, actual);
  }

  @Test
  public void test4RemoveNthFromEnd() {
    // input test
    ListNode head = new ListNode(1);
    int n = 1;

    // set expected value
    ListNode expected = null;

    // perform test
    ListNode actual = removeNthNodeFromEndList.removeNthFromEnd(head, n);

    assertListNode(expected, actual);
  }

  private void assertListNode(ListNode expected, ListNode actual) {
    while (expected != null && actual != null) {
      assertEquals(expected.val, actual.val);

      expected = expected.next;
      actual = actual.next;
    }
    assertNull(expected);
    assertNull(actual);
  }

  private void add(ListNode head, int val) {
    ListNode indexNode = head;
    while (indexNode.next != null) {
      indexNode = indexNode.next;
    }

    indexNode.next = new ListNode(val);
  }
}
