package hard.f;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstMissingPositiveTest {

  private FirstMissingPositive firstMissingPositive;

  @Before
  public void setUp() {
    firstMissingPositive = new FirstMissingPositive();
  }

  @Test
  public void test1FirstMissingPositive() {
    // test input
    int[] nums = {1, 2, 0};

    // set expected value
    int expected = 3;

    // perform test
    int actual = firstMissingPositive.firstMissingPositive(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2FirstMissingPositive() {
    // test input
    int[] nums = {3, 4, -1, 1};

    // set expected value
    int expected = 2;

    // perform test
    int actual = firstMissingPositive.firstMissingPositive(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3FirstMissingPositive() {
    // test input
    int[] nums = {7, 8, 9, 11, 12};

    // set expected value
    int expected = 1;

    // perform test
    int actual = firstMissingPositive.firstMissingPositive(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4FirstMissingPositive() {
    // test input
    int[] nums = {1, 2, 3};

    // set expected value
    int expected = 4;

    // perform test
    int actual = firstMissingPositive.firstMissingPositive(nums);

    // assertion
    assertEquals(expected, actual);
  }
}
