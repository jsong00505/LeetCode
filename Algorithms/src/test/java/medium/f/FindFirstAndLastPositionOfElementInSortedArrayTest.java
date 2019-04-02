package medium.f;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

  private FindFirstAndLastPositionOfElementInSortedArray searchArray;

  @Before
  public void setUp() {
    searchArray = new FindFirstAndLastPositionOfElementInSortedArray();
  }

  @Test
  public void test1SearchRange() {
    // test input
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;

    // set expected
    int[] expected = {3, 4};

    // perform test
    int[] actual = searchArray.searchRange(nums, target);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2SearchRange() {
    // test input
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 6;

    // set expected
    int[] expected = {-1, -1};

    // perform test
    int[] actual = searchArray.searchRange(nums, target);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test3SearchRange() {
    // test input
    int[] nums = {};
    int target = 6;

    // set expected
    int[] expected = {-1, -1};

    // perform test
    int[] actual = searchArray.searchRange(nums, target);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test4SearchRange() {
    // test input
    int[] nums = {6};
    int target = 6;

    // set expected
    int[] expected = {0, 0};

    // perform test
    int[] actual = searchArray.searchRange(nums, target);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test5SearchRange() {
    // test input
    int[] nums = {6, 6};
    int target = 6;

    // set expected
    int[] expected = {0, 1};

    // perform test
    int[] actual = searchArray.searchRange(nums, target);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test6SearchRange() {
    // test input
    int[] nums = {1, 6, 6};
    int target = 6;

    // set expected
    int[] expected = {1, 2};

    // perform test
    int[] actual = searchArray.searchRange(nums, target);

    // assertion
    assertArrayEquals(expected, actual);
  }
}
