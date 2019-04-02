package easy.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {

  private SearchInsertPosition searchInsertPosition;

  @Before
  public void setUp() {
    searchInsertPosition = new SearchInsertPosition();
  }

  @Test
  public void test1SearchInsert() {
    // test input
    int[] nums = {1, 3, 5, 6};
    int target = 5;

    // set expected value
    int expected = 2;

    // perform test
    int actual = searchInsertPosition.searchInsert(nums, target);

    // aasertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2SearchInsert() {
    // test input
    int[] nums = {1, 3, 5, 6};
    int target = 2;

    // set expected value
    int expected = 1;

    // perform test
    int actual = searchInsertPosition.searchInsert(nums, target);

    // aasertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3SearchInsert() {
    // test input
    int[] nums = {1, 3, 5, 6};
    int target = 7;

    // set expected value
    int expected = 4;

    // perform test
    int actual = searchInsertPosition.searchInsert(nums, target);

    // aasertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4SearchInsert() {
    // test input
    int[] nums = {1, 3, 5, 6};
    int target = 0;

    // set expected value
    int expected = 0;

    // perform test
    int actual = searchInsertPosition.searchInsert(nums, target);

    // aasertion
    assertEquals(expected, actual);
  }
}
