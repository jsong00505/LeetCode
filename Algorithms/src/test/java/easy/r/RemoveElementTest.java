package easy.r;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class RemoveElementTest {

  private RemoveElement removeElement;

  @Before
  public void setUp() {
    removeElement = new RemoveElement();
  }

  @Test
  public void test1RemoveElement() {
    // test input
    int[] nums = {3, 2, 2, 3};
    int val = 3;

    // set expected value
    int[] expected = {2, 2};

    // perform test
    int length = removeElement.removeElement(nums, val);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2RemoveElement() {
    // test input
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;

    // set expected value
    int[] expected = {0, 1, 3, 0, 4};

    // perform test
    int length = removeElement.removeElement(nums, val);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test3RemoveElement() {
    // test input
    int[] nums = {};
    int val = 0;

    // set expected value
    int[] expected = {};

    // perform test
    int length = removeElement.removeElement(nums, val);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test4RemoveElement() {
    // test input
    int[] nums = {1};
    int val = 0;

    // set expected value
    int[] expected = {1};

    // perform test
    int length = removeElement.removeElement(nums, val);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void test5RemoveElement() {
    // test input
    int[] nums = {0};
    int val = 0;

    // set expected value
    int[] expected = {};

    // perform test
    int length = removeElement.removeElement(nums, val);
    int[] actual = Arrays.copyOf(nums, length);

    assertArrayEquals(expected, actual);
  }
}
