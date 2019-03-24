package easy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class TwoSumTest {

  private static TwoSum twoSum;

  @Before
  public void setUp() {
    twoSum = new TwoSum();
  }

  @Test
  public void test1TwoSum() throws Exception {
    // test input
    int[] nums = {3, 3};
    int target = 6;

    // set expected value
    int[] expected = {0, 1};

    // perform test
    int[] actual = twoSum.twoSum(nums, target);

    // assertion
    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void test2TwoSum() throws Exception {
    // test input
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    // set expected value
    int[] expected = {0, 1};

    // perform test
    int[] actual = twoSum.twoSum(nums, target);

    // assertion
    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void test1TwoSumN2() throws Exception {
    // test input
    int[] nums = {3, 3};
    int target = 6;

    // set expected value
    int[] expected = {0, 1};

    // perform test
    int[] actual = twoSum.twoSumN2(nums, target);

    // assertion
    assertTrue(Arrays.equals(expected, actual));
  }

  @Test
  public void test2TwoSumN2() throws Exception {
    // test input
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    // set expected value
    int[] expected = {0, 1};

    // perform test
    int[] actual = twoSum.twoSumN2(nums, target);

    // assertion
    assertTrue(Arrays.equals(expected, actual));
  }
}