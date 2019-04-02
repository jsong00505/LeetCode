package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInRotatedSortedArrayTest {

  private SearchInRotatedSortedArray searchInRotatedSortedArray;

  @Before
  public void setUp() {
    searchInRotatedSortedArray = new SearchInRotatedSortedArray();
  }

  @Test
  public void test1Search() {
    // test inputs
    int[] nums = {0, 1, 2, 4, 5, 6, 7};
    int target = 3;

    // set expected value
    int expected = -1;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Search() {
    // test inputs
    int[] nums = {0, 1, 2, 4, 5, 6, 7};
    int target = 2;

    // set expected value
    int expected = 2;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Search() {
    // test inputs
    int[] nums = {8, 9, 10, 0, 1, 2, 4, 5, 6, 7};
    int target = 10;

    // set expected value
    int expected = 2;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Search() {
    // test inputs
    int[] nums = {0};
    int target = 1;

    // set expected value
    int expected = -1;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5Search() {
    // test inputs
    int[] nums = {0};
    int target = 0;

    // set expected value
    int expected = 0;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6Search() {
    // test inputs
    int[] nums = {0, 1};
    int target = 0;

    // set expected value
    int expected = 0;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7Search() {
    // test inputs
    int[] nums = {1, 0};
    int target = 1;

    // set expected value
    int expected = 0;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8Search() {
    // test inputs
    int[] nums = {};
    int target = 0;

    // set expected value
    int expected = -1;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9Search() {
    // test inputs
    int[] nums = {3, 1};
    int target = 1;

    // set expected value
    int expected = 1;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10Search() {
    // test inputs
    int[] nums = {8, 9, 1, 2, 3, 4, 5};
    int target = 1;

    // set expected value
    int expected = 2;

    // perform test
    int actual = searchInRotatedSortedArray.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }
}
