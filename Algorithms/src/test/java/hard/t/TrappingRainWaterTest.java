package hard.t;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {

  private TrappingRainWater trappingRainWater;

  @Before
  public void setUp() {
    trappingRainWater = new TrappingRainWater();
  }

  @Test
  public void test1Trap() {
    // test input
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    // set expected value
    int expected = 6;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Trap() {
    // test input
    int[] height = {0};

    // set expected value
    int expected = 0;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Trap() {
    // test input
    int[] height = {0, 1};

    // set expected value
    int expected = 0;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Trap() {
    // test input
    int[] height = {0, 1, 0};

    // set expected value
    int expected = 0;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5Trap() {
    // test input
    int[] height = {0, 1, 5};

    // set expected value
    int expected = 0;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6Trap() {
    // test input
    int[] height = {7, 1, 0};

    // set expected value
    int expected = 0;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7Trap() {
    // test input
    int[] height = {4, 1, 7};

    // set expected value
    int expected = 3;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8Trap() {
    // test input
    int[] height = {8, 1, 5};

    // set expected value
    int expected = 4;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test9Trap() {
    // test input
    int[] height = {};

    // set expected value
    int expected = 0;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test10Trap() {
    // test input
    int[] height = {3, 1, 3, 1, 3, 1, 3, 1};

    // set expected value
    int expected = 6;

    // perform test
    int actual = trappingRainWater.trap(height);

    // assertion
    assertEquals(expected, actual);
  }
}
