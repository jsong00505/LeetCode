package medium.w;

/**
 * Created by jsong on 2019-04-13.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Word Search (https://leetcode.com/problems/word-search/)
 */
public class WordSearch {

  private int RIGHT = 0;
  private int UP = 1;
  private int LEFT = 2;
  private int DOWN = 3;

  private int[] rowDirection = {0, -1, 0, 1};
  private int[] columnDirection = {1, 0, -1, 0};

  public boolean exist(char[][] board, String word) {
    if (board == null || board.length == 0 || board[0].length == 0) {
      return false;
    }

    boolean[][] visited = new boolean[board.length][board[0].length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == word.charAt(0)) {
          visited[i][j] = true;
          if (backTracking(board, word, visited, 0, i, j)) {
            return true;
          }
          visited[i][j] = false;
        }
      }
    }

    return false;
  }

  private boolean backTracking(
      char[][] board, String word, boolean[][] visited, int index, int row, int column) {
    if (word.length() - 1 == index) {
      return true;
    }

    // check up
    boolean exist;
    exist = goToThisDirection(UP, board, word, visited, index, row, column);
    if (!exist) {
      exist = goToThisDirection(DOWN, board, word, visited, index, row, column);
    }
    if (!exist) {
      exist = goToThisDirection(LEFT, board, word, visited, index, row, column);
    }
    if (!exist) {
      exist = goToThisDirection(RIGHT, board, word, visited, index, row, column);
    }

    // go down
    return exist;
  }

  private boolean goToThisDirection(
      int direction,
      char[][] board,
      String word,
      boolean[][] visited,
      int index,
      int row,
      int column) {
    boolean exist = false;
    if (isValid(direction, board, word, visited, index + 1, row, column)) {
      visited[row + rowDirection[direction]][column + columnDirection[direction]] = true;
      if (backTracking(
          board,
          word,
          visited,
          index + 1,
          row + rowDirection[direction],
          column + columnDirection[direction])) {
        exist = true;
      }
      visited[row + rowDirection[direction]][column + columnDirection[direction]] = false;
    }
    return exist;
  }

  private boolean isValid(
      int direction,
      char[][] board,
      String word,
      boolean[][] visited,
      int index,
      int row,
      int column) {
    int maxRow = visited.length;
    int maxColumn = visited[0].length;

    if (direction == UP) {
      if (row + rowDirection[UP] < 0
          || visited[row + rowDirection[UP]][column]
          || board[row + rowDirection[UP]][column] != word.charAt(index)) {
        return false;
      }
    }

    if (direction == DOWN) {
      if (row + rowDirection[DOWN] >= maxRow
          || visited[row + rowDirection[DOWN]][column]
          || board[row + rowDirection[DOWN]][column] != word.charAt(index)) {
        return false;
      }
    }

    if (direction == RIGHT) {
      if (column + columnDirection[RIGHT] >= maxColumn
          || visited[row][column + columnDirection[RIGHT]]
          || board[row][column + columnDirection[RIGHT]] != word.charAt(index)) {
        return false;
      }
    }

    if (direction == LEFT) {
      if (column + columnDirection[LEFT] < 0
          || visited[row][column + columnDirection[LEFT]]
          || board[row][column + columnDirection[LEFT]] != word.charAt(index)) {
        return false;
      }
    }

    return true;
  }
}
