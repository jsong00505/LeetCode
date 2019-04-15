package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInRotatedSortedArrayTwoTest {

  private SearchInRotatedSortedArrayTwo searchInRotatedSortedArrayTwo;

  @Before
  public void setUp() {
    searchInRotatedSortedArrayTwo = new SearchInRotatedSortedArrayTwo();
  }

  @Test
  public void test1Search() {
    // test input
    int[] nums = {1, 2, 3, 0, 1};
    int target = 2;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Search() {
    // test input
    int[] nums = {1};
    int target = 2;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Search() {
    // test input
    int[] nums = {1};
    int target = 1;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Search() {
    // test input
    int[] nums = {};
    int target = 1;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5Search() {
    // test input
    int[] nums = {5, 6, 7, 8, 8, 9, 9, 0, 1, 1, 1, 2, 2};
    int target = 6;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6Search() {
    // test input
    int[] nums = {5, 6, 7, 8, 8, 9, 9, 0, 1, 1, 1, 2, 2};
    int target = 7;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7Search() {
    // test input
    int[] nums = {5, 6, 7, 8, 8, 9, 9, 0, 1, 1, 1, 2, 2};
    int target = 8;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8Search() {
    // test input
    int[] nums = {5, 6, 7, 8, 8, 9, 9, 0, 1, 1, 1, 2, 2};
    int target = 3;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9Search() {
    // test input
    int[] nums = {5, 6, 7, 8, 8, 9, 9, 0, 1, 1, 1, 2, 2};
    int target = 1;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10Search() {
    // test input
    int[] nums = {5, 6, 7, 8, 8, 9, 9, 0, 1, 1, 1, 2, 2};
    int target = 0;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test11Search() {
    // test input
    int[] nums = {1, 1, 3, 1};
    int target = 3;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test12Search() {
    // test input
    int[] nums = {1, 3, 1, 1, 1};
    int target = 3;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test13Search() {
    // test input
    int[] nums = {3, 5, 1};
    int target = 3;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchInRotatedSortedArrayTwo.search(nums, target);

    // assertion
    assertEquals(expected, actual);
  }
}
