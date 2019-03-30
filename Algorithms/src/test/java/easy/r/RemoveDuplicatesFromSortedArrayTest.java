package easy.r;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesFromSortedArrayTest {

  private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

  @Before
  public void setUp() {
    removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
  }

  @Test
  public void test1RemoveDuplicates() {
    // input test
    int[] nums = new int[] {1, 1, 2};

    // set expected
    int[] expected = new int[] {1, 2};

    // perform test
    int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2RemoveDuplicates() {
    // input test
    int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    // set expected
    int[] expected = new int[] {0, 1, 2, 3, 4};

    // perform test
    int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test3RemoveDuplicates() {
    // input test
    int[] nums = new int[] {};

    // set expected
    int[] expected = new int[] {};

    // perform test
    int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test4RemoveDuplicates() {
    // input test
    int[] nums = new int[] {1};

    // set expected
    int[] expected = new int[] {1};

    // perform test
    int length = removeDuplicatesFromSortedArray.removeDuplicates(nums);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }
}
