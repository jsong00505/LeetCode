package hard.j;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpGameTwoTest {

  private JumpGameTwo jumpGameTwo;

  @Before
  public void setUp() {
    jumpGameTwo = new JumpGameTwo();
  }

  @Test
  public void test1Jump() {
    // test input
    int[] nums = {2, 3, 1, 1, 4};

    // set expected value
    int expected = 2;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Jump() {
    // test input
    int[] nums = {2, 3, 3, 1, 4, 1};

    // set expected value
    int expected = 2;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Jump() {
    // test input
    int[] nums = {};

    // set expected value
    int expected = 0;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Jump() {
    // test input
    int[] nums = {1};

    // set expected value
    int expected = 0;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5Jump() {
    // test input
    int[] nums = {
      5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8,
      8, 4, 4, 2, 0, 3, 8, 5
    };

    // set expected value
    int expected = 5;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6Jump() {
    // test input
    int[] nums = {
      5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8,
      8, 4, 4, 2, 0, 3, 8, 5, 8, 1
    };

    // set expected value
    int expected = 6;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7Jump() {
    // test input
    int[] nums = {
      5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5, 8, 1
    };

    // set expected value
    int expected = 5;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8Jump() {
    // test input
    int[] nums = {
      5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5, 8, 1, 5,
      6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5, 8, 1
    };

    // set expected value
    int expected = 9;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9Jump() {
    // test input
    int[] nums = {
      2, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5, 8, 1, 5,
      6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5, 8, 1
    };

    // set expected value
    int expected = 10;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10Jump() {
    // test input
    int[] nums = {5, 1, 1, 5, 1, 1, 1, 1, 1};

    // set expected value
    int expected = 2;

    // perform test
    int actual = jumpGameTwo.jump(nums);

    // assertion
    assertEquals(expected, actual);
  }
}
