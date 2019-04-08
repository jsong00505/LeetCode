package easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

  private MaximumSubarray maximumSubarray;

  @Before
  public void setUp() {
    maximumSubarray = new MaximumSubarray();
  }

  @Test
  public void test1MaxSubArray() {
    // test input
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    // set expected value
    int expected = 6;

    // perform test
    int actual = maximumSubarray.maxSubArray(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2MaxSubArray() {
    // test input
    int[] nums = {-2, 1};

    // set expected value
    int expected = 1;

    // perform test
    int actual = maximumSubarray.maxSubArray(nums);

    // assertion
    assertEquals(expected, actual);
  }
}
