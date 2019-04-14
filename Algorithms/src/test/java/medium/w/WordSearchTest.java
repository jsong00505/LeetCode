package medium.w;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordSearchTest {
  private WordSearch wordSearch;

  @Before
  public void setUp() {
    wordSearch = new WordSearch();
  }

  @Test
  public void test1Exist() {
    // test input
    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "ABCCED";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = wordSearch.exist(board, word);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Exist() {
    // test input
    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "SEE";

    // set expected value
    boolean expected = true;

    // perform test
    boolean actual = wordSearch.exist(board, word);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Exist() {
    // test input
    char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "ABCB";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wordSearch.exist(board, word);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Exist() {
    // test input
    char[][] board = {{'A'}, {'A'}};
    String word = "AAA";

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = wordSearch.exist(board, word);

    // assertion
    assertEquals(expected, actual);
  }
}
