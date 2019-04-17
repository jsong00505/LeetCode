package hard.m;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalRectangleTest {

  private MaximalRectangle maximalRectangle;

  @Before
  public void setUp() {
    maximalRectangle = new MaximalRectangle();
  }

  @Test
  public void maximalRectangle() {
    // test input
    char[][] matrix = {
      {'1', '0', '1', '0', '0'},
      {'1', '0', '1', '1', '1'},
      {'1', '1', '1', '1', '1'},
      {'1', '0', '0', '1', '0'}
    };

    // set expected value
    int expected = 6;

    // perform test
    int actual = maximalRectangle.maximalRectangle(matrix);

    // assertion
    assertEquals(expected, actual);
  }
}
