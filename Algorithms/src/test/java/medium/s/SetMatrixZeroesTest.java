package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SetMatrixZeroesTest {

  private SetMatrixZeroes setMatrixZeroes;

  @Before
  public void setUp() {
    setMatrixZeroes = new SetMatrixZeroes();
  }

  @Test
  public void test1SetZeroes() {
    // test input
    int[][] actual = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

    // set expected value
    int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

    // perform test
    setMatrixZeroes.setZeroes(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2SetZeroes() {
    // test input
    int[][] actual = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

    // set expected value
    int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

    // perform test
    setMatrixZeroes.setZeroes(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }
}
