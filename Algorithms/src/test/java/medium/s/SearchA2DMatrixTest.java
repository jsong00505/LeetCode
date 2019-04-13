package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchA2DMatrixTest {

  private SearchA2DMatrix searchA2DMatrix;

  @Before
  public void setUp() {
    searchA2DMatrix = new SearchA2DMatrix();
  }

  @Test
  public void test1SearchMatrix() {
    // test input
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    int target = 3;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2SearchMatrix() {
    // test input
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    int target = 13;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3SearchMatrix() {
    // test input
    int[][] matrix = {{1}, {3}, {5}};
    int target = 0;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4SearchMatrix() {
    // test input
    int[][] matrix = {{1}};
    int target = 1;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5SearchMatrix() {
    // test input
    int[][] matrix = {{}};
    int target = 1;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test6SearchMatrix() {
    // test input
    int[][] matrix = null;
    int target = 1;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test7SearchMatrix() {
    // test input
    int[][] matrix = {};
    int target = 1;

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test8SearchMatrix() {
    // test input
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    int target = 11;

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = searchA2DMatrix.searchMatrix(matrix, target);

    // assertion
    assertEquals(expected, actual);
  }
}
