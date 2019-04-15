package medium.r;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by jsong on 2019-04-14.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge
 */
public class RemoveDuplicatesFromSortedArrayTwoTest {

  private RemoveDuplicatesFromSortedArrayTwo removeDuplicatesFromSortedArrayTwo;

  @Before
  public void setUp() {
    removeDuplicatesFromSortedArrayTwo = new RemoveDuplicatesFromSortedArrayTwo();
  }

  @Test
  public void test1RemoveDuplicates() {
    // test input
    int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3};

    // set expected value
    int expected = 6;
    int[] expectedNums = {1, 1, 2, 2, 3, 3, 3, 3, 3};

    // perform test
    int actual = removeDuplicatesFromSortedArrayTwo.removeDuplicates(nums);

    // assertion
    assertEquals(expected, actual);
    assertArrayEquals(nums, expectedNums);
  }

  @Test
  public void test2RemoveDuplicates() {
    // test input
    int[] nums = {1, 1, 1, 2, 2, 3};

    // set expected value
    int expected = 5;
    int[] expectedNums = {1, 1, 2, 2, 3, 3};

    // perform test
    int actual = removeDuplicatesFromSortedArrayTwo.removeDuplicates(nums);

    // assertion
    assertEquals(expected, actual);
    assertArrayEquals(nums, expectedNums);
  }

  @Test
  public void test3RemoveDuplicates() {
    // test input
    int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

    // set expected value
    int expected = 7;
    int[] expectedNums = {0, 0, 1, 1, 2, 3, 3, 3, 3};

    // perform test
    int actual = removeDuplicatesFromSortedArrayTwo.removeDuplicates(nums);

    // assertion
    assertEquals(expected, actual);
    assertArrayEquals(nums, expectedNums);
  }

  @Test
  public void test4RemoveDuplicates() {
    // test input
    int[] nums = {0};

    // set expected value
    int expected = 1;
    int[] expectedNums = {0};

    // perform test
    int actual = removeDuplicatesFromSortedArrayTwo.removeDuplicates(nums);

    // assertion
    assertEquals(expected, actual);
    assertArrayEquals(nums, expectedNums);
  }

  @Test
  public void test5RemoveDuplicates() {
    // test input
    int[] nums = {};

    // set expected value
    int expected = 0;
    int[] expectedNums = {};

    // perform test
    int actual = removeDuplicatesFromSortedArrayTwo.removeDuplicates(nums);

    // assertion
    assertEquals(expected, actual);
    assertArrayEquals(nums, expectedNums);
  }
}