package medium.m;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPathSumTest {

  private MinimumPathSum minimumPathSum;

  @Before
  public void setUp() {
    minimumPathSum = new MinimumPathSum();
  }

  @Test
  public void test1inPathSum() {
    // test input
    int[][] grid = new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};

    // set expected value
    int expected = 7;

    // perform test
    int actual = minimumPathSum.minPathSum(grid);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2MinPathSum() {
    // test input
    int[][] grid = new int[][] {{1, 1, 1}, {3, 5, 2}, {6, 1, 1}};

    // set expected value
    int expected = 6;

    // perform test
    int actual = minimumPathSum.minPathSum(grid);

    // assertion
    assertEquals(expected, actual);
  }
}
