package medium.c;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

  private ContainerWithMostWater containerWithMostWater;

  @Before
  public void setUp() {
    containerWithMostWater = new ContainerWithMostWater();
  }

  @Test
  public void test1MaxArea() {
    // test input
    int[] height = {1,8,6,2,5,4,8,3,7};

    // set expected value
    int expected = 49;

    // perform test
    int actual = containerWithMostWater.maxArea(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2MaxArea() {
    // test input
    int[] height = {1,7};

    // set expected value
    int expected = 1;

    // perform test
    int actual = containerWithMostWater.maxArea(height);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3MaxArea() {
    // test input
    int[] height = {7,1};

    // set expected value
    int expected = 1;

    // perform test
    int actual = containerWithMostWater.maxArea(height);

    // assertion
    assertEquals(expected, actual);
  }
}