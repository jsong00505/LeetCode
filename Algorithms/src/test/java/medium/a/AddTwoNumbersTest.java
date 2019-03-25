package medium.a;

import common.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

  private AddTwoNumbers addTwoNumbers;

  @Before
  public void setUp() {
    addTwoNumbers = new AddTwoNumbers();
  }

  @Test
  public void test1AddTwoNumbers() {
    // test inputs
    ListNode l1 = generateNode(new int[] {2, 4, 3});
    ListNode l2 = generateNode(new int[] {5, 6, 4});

    // set expected value
    ListNode expected = generateNode(new int[] {7, 0, 8});

    // perform test
    ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

    // assertions
    while (actual != null && expected != null) {
      assertEquals(expected.val, actual.val);

      expected = expected.next;
      actual = actual.next;
    }

    assertNull(expected);
    assertNull(actual);
  }

  @Test
  public void test2AddTwoNumbers() {
    // test inputs
    ListNode l1 = generateNode(new int[] {5});
    ListNode l2 = generateNode(new int[] {5});

    // set expected value
    ListNode expected = generateNode(new int[] {0, 1});

    // perform test
    ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

    // assertions
    while (actual != null && expected != null) {
      assertEquals(expected.val, actual.val);

      expected = expected.next;
      actual = actual.next;
    }

    assertNull(expected);
    assertNull(actual);
  }

  @Test
  public void test3AddTwoNumbers() {
    // test inputs
    ListNode l1 = generateNode(new int[] {1, 8});
    ListNode l2 = generateNode(new int[] {0});

    // set expected value
    ListNode expected = generateNode(new int[] {1, 8});

    // perform test
    ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);

    // assertions
    while (actual != null && expected != null) {
      assertEquals(expected.val, actual.val);

      expected = expected.next;
      actual = actual.next;
    }

    assertNull(expected);
    assertNull(actual);
  }

  private ListNode generateNode(int[] numbs) {

    ListNode firstNode = null;
    ListNode indexNode = null;
    for (int num : numbs) {
      if (indexNode == null) {
        firstNode = new ListNode(num);
        indexNode = firstNode;
      } else {
        indexNode.next = new ListNode(num);
        indexNode = indexNode.next;
      }
    }
    return firstNode;
  }
}
