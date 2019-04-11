package medium.u;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class UniquePathsTwoTest {
  private UniquePathsTwo uniquePathsTwo;

  @Before
  public void setUp() {
    uniquePathsTwo = new UniquePathsTwo();
  }

  @Test
  public void test1UniquePathsWithObstacles() {
    // test input
    int[][] obstacleGrid = new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    // set expected value
    int expected = 2;
    // perform test
    int actual = uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2UniquePathsWithObstacles() {
    // test input
    int[][] obstacleGrid = new int[][] {{0}};
    // set expected value
    int expected = 1;
    // perform test
    int actual = uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3UniquePathsWithObstacles() {
    // test input
    int[][] obstacleGrid = new int[][] {{0, 0, 0}};
    // set expected value
    int expected = 1;
    // perform test
    int actual = uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4UniquePathsWithObstacles() {
    // test input
    int[][] obstacleGrid = new int[][] {{0, 1, 0}};
    // set expected value
    int expected = 0;
    // perform test
    int actual = uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5UniquePathsWithObstacles() {
    // test input
    int[][] obstacleGrid = new int[][] {{0}, {1}, {0}};
    // set expected value
    int expected = 0;
    // perform test
    int actual = uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6UniquePathsWithObstacles() {
    // test input
    int[][] obstacleGrid = new int[][] {{1, 0}};
    // set expected value
    int expected = 0;
    // perform test
    int actual = uniquePathsTwo.uniquePathsWithObstacles(obstacleGrid);
    // assertion
    assertEquals(expected, actual);
  }
}
