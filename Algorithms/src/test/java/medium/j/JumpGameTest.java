package medium.j;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class JumpGameTest {
  private JumpGame jumpGame;

  @Before
  public void setUp() {
    jumpGame = new JumpGame();
  }

  @Test
  public void test1CanJump() {
    // test input
    int[] nums = {2, 3, 1, 1, 4};
    // set expected value
    boolean expected = true;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2CanJump() {
    // test input
    int[] nums = {3, 2, 1, 0, 4};
    // set expected value
    boolean expected = false;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3CanJump() {
    // test input
    int[] nums = {0, 1};
    // set expected value
    boolean expected = false;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4CanJump() {
    // test input
    int[] nums = {0};
    // set expected value
    boolean expected = true;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5CanJump() {
    // test input
    int[] nums = {1};
    // set expected value
    boolean expected = true;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6CanJump() {
    // test input
    int[] nums = {};
    // set expected value
    boolean expected = true;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7CanJump() {
    // test input
    int[] nums = {2, 3, 1, 1, 0};
    // set expected value
    boolean expected = true;
    // perform test
    boolean actual = jumpGame.canJump(nums);
    // assertion
    assertEquals(expected, actual);
  }
}
