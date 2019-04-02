package medium.v;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidSudokuTest {

  private ValidSudoku validSudoku;

  @Before
  public void setUp() {
    validSudoku = new ValidSudoku();
  }

  @Test
  public void test1IsValidSudoku() {
    // test input
    char[][] board = {
      {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    // set expected result
    boolean expected = true;

    // perform test
    boolean actual = validSudoku.isValidSudoku(board);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2IsValidSudoku() {
    // test input
    char[][] board = {
      {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    // set expected result
    boolean expected = false;

    // perform test
    boolean actual = validSudoku.isValidSudoku(board);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3IsValidSudoku() {
    // test input
    char[][] board = {
      {'.', '.', '.', '2', '.', '.', '6', '.', '.'},
      {'.', '.', '.', '1', '.', '.', '.', '.', '.'},
      {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
      {'.', '.', '.', '5', '.', '1', '.', '.', '8'},
      {'.', '3', '.', '.', '.', '.', '.', '.', '.'},
      {'.', '.', '.', '9', '.', '.', '.', '.', '3'},
      {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
      {'.', '.', '.', '.', '.', '.', '3', '8', '.'},
      {'.', '.', '.', '.', '.', '.', '.', '.', '4'}
    };

    // set expected result
    boolean expected = true;

    // perform test
    boolean actual = validSudoku.isValidSudoku(board);

    // assertion
    assertEquals(expected, actual);
  }
}
