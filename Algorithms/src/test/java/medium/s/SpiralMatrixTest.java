package medium.s;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SpiralMatrixTest {
  private SpiralMatrix spiralMatrix;

  @Before
  public void setUp() {
    spiralMatrix = new SpiralMatrix();
  }

  @Test
  public void test1SpiralOrder() {
    // test input
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // set expected value;
    List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
    // perform test
    List<Integer> actual = spiralMatrix.spiralOrder(matrix);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2SpiralOrder() {
    // test input
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    // set expected value;
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    // perform test
    List<Integer> actual = spiralMatrix.spiralOrder(matrix);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3SpiralOrder() {
    // test input
    int[][] matrix = {{1}, {2}, {3}};
    // set expected value;
    List<Integer> expected = Arrays.asList(1, 2, 3);
    // perform test
    List<Integer> actual = spiralMatrix.spiralOrder(matrix);
    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4SpiralOrder() {
    // test input
    int[][] matrix = {{1}};
    // set expected value;
    List<Integer> expected = Arrays.asList(1);
    // perform test
    List<Integer> actual = spiralMatrix.spiralOrder(matrix);
    // assertion
    assertEquals(expected, actual);
  }
}
