package hard.q;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QueensN2Test {

  private QueensN2 queensN2;

  @Before
  public void setUp() {
    queensN2 = new QueensN2();
  }

  @Test
  public void solveNQueens() {
    // test input
    int n = 4;

    // set expected value
    int expected = 2;

    // perform test
    int actual = queensN2.totalNQueens(n);

    // assertion
    assertEquals(expected, actual);
  }
}
