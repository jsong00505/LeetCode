package medium.u;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UniquePathsTest {

  private UniquePaths uniquePaths;

  @Before
  public void setUp() {
    uniquePaths = new UniquePaths();
  }

  @Test
  public void test1UniquePaths() {
    // test input
    int m = 3;
    int n = 2;

    // set expected value
    int expected = 3;

    // perform test
    int actual = uniquePaths.uniquePaths(m, n);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2UniquePaths() {
    // test input
    int m = 0;
    int n = 0;

    // set expected value
    int expected = 0;

    // perform test
    int actual = uniquePaths.uniquePaths(m, n);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3UniquePaths() {
    // test input
    int m = 10;
    int n = 10;

    // set expected value
    int expected = 48620;

    // perform test
    int actual = uniquePaths.uniquePaths(m, n);

    // assertion
    assertEquals(expected, actual);
  }
}
