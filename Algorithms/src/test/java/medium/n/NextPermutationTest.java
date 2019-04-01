package medium.n;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextPermutationTest {

  private NextPermutation nextPermutation;

  @Before
  public void setUp() {
    nextPermutation = new NextPermutation();
  }

  @Test
  public void test1NextPermutation() {
    // input test
    int[] nums = {1, 2, 3};

    // set expected value
    int[] expected = {1, 3, 2};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2NextPermutation() {
    // input test
    int[] nums = {3, 2, 1};

    // set expected value
    int[] expected = {1, 2, 3};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test3NextPermutation() {
    // input test
    int[] nums = {1, 1, 5};

    // set expected value
    int[] expected = {1, 5, 1};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test4NextPermutation() {
    // input test
    int[] nums = {2, 3, 1};

    // set expected value
    int[] expected = {3, 1, 2};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test5NextPermutation() {
    // input test
    int[] nums = {2, 1, 3, 4};

    // set expected value
    int[] expected = {2, 1, 4, 3};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test6NextPermutation() {
    // input test
    int[] nums = {2, 4, 3, 1};

    // set expected value
    int[] expected = {3, 1, 2, 4};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test7extPermutation() {
    // input test
    int[] nums = {};

    // set expected value
    int[] expected = {};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test8extPermutation() {
    // input test
    int[] nums = {1};

    // set expected value
    int[] expected = {1};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test9extPermutation() {
    // input test
    int[] nums = {1, 2, 3, 15, 2, 3, 4, 4, 5, 5, 7, 5, 5, 4, 3};

    // set expected value
    int[] expected = {1, 2, 3, 15, 2, 3, 4, 4, 5, 7, 3, 4, 5, 5, 5};

    // perform test
    nextPermutation.nextPermutation(nums);
    int[] actual = nums;

    assertArrayEquals(expected, actual);
  }
}
