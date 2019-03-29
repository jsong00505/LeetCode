package medium.f;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FourSumTest {

  private FourSum fourSum;

  @Before
  public void setUp() {
    fourSum = new FourSum();
  }

  @Test
  public void test1FourSum() {
    // input test
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-2, -1, 1, 2));
    expected.add(Arrays.asList(-2, 0, 0, 2));
    expected.add(Arrays.asList(-1, 0, 0, 1));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test2FourSum() {
    // input test
    int[] nums = {1, 0, -1, 0, -2, 2, 1, 2};
    int target = 0;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-2, -1, 1, 2));
    expected.add(Arrays.asList(-2, 0, 0, 2));
    expected.add(Arrays.asList(-2, 0, 1, 1));
    expected.add(Arrays.asList(-1, 0, 0, 1));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test3FourSum() {
    // input test
    int[] nums = {1, 0, -1, 0, -2, 2, 1, 2};
    int target = 3;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-2, 1, 2, 2));
    expected.add(Arrays.asList(-1, 0, 2, 2));
    expected.add(Arrays.asList(-1, 1, 1, 2));
    expected.add(Arrays.asList(0, 0, 1, 2));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test4FourSum() {
    // input test
    int[] nums = {0, 0, 0, 0, 1, 1, 1, 1, 4, 2, 2};
    int target = 4;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(0, 0, 0, 4));
    expected.add(Arrays.asList(0, 0, 2, 2));
    expected.add(Arrays.asList(0, 1, 1, 2));
    expected.add(Arrays.asList(1, 1, 1, 1));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test5FourSum() {
    // input test
    int[] nums = {0, 0, 0, 0};
    int target = 0;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(0, 0, 0, 0));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test6FourSum() {
    // input test
    int[] nums = {1, -2, -5, -4, -3, 3, 3, 5};
    int target = -11;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-5, -4, -3, 1));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }

  @Test
  public void test7FourSum() {
    // input test
    int[] nums = {-1, 0, 1, 2, -1, -4};
    int target = -1;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-4, 0, 1, 2));
    expected.add(Arrays.asList(-1, -1, 0, 1));

    // perform test
    List<List<Integer>> actual = fourSum.fourSum(nums, target);

    // assertions
    assertEquals(expected, actual);
  }
}
