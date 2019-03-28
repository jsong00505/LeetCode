package medium.t;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumClosestTest {

  private ThreeSumClosest threeSumClosest;

  @Before
  public void setUp() {
    threeSumClosest = new ThreeSumClosest();
  }

  @Test
  public void test1ThreeSumClosest() {
    // test input
    int[] nums = {-1, 2, 1, -4};
    int target = 1;

    // set expected value
    int expected = 2;

    // perform test
    int actual = threeSumClosest.threeSumClosest(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2ThreeSumClosest() {
    // test input
    int[] nums = {0, 0, 0};
    int target = 2;

    // set expected value
    int expected = 0;

    // perform test
    int actual = threeSumClosest.threeSumClosest(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3ThreeSumClosest() {
    // test input
    int[] nums = {0, 0, 1};
    int target = 2;

    // set expected value
    int expected = 1;

    // perform test
    int actual = threeSumClosest.threeSumClosest(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4ThreeSumClosest() {
    // test input
    int[] nums = {-3, -2, 0, 0, 1, 9, -3, 5, -3, -12, -8, 111, 70, 48, -32, 55, -12, 15};
    int target = 15;

    // set expected value
    int expected = 15;

    // perform test
    int actual = threeSumClosest.threeSumClosest(nums, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5ThreeSumClosest() {
    // test input
    int[] nums = {0, 2, 1, -3};
    int target = 1;

    // set expected value
    int expected = 0;

    // perform test
    int actual = threeSumClosest.threeSumClosest(nums, target);

    // assertion
    assertEquals(expected, actual);
  }
}
