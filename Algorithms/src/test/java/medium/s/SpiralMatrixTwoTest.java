package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpiralMatrixTwoTest {

  private SpiralMatrixTwo spiralMatrixTwo;

  @Before
  public void setUp() {
    spiralMatrixTwo = new SpiralMatrixTwo();
  }

  @Test
  public void generateMatrix() {
    // test input
    int n = 3;

    // set expected value
    int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

    // perform test
    int[][] actual = spiralMatrixTwo.generateMatrix(n);

    // assertion
    assertArrayEquals(expected, actual);
  }
}
