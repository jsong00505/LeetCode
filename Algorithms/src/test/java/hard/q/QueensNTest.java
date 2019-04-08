package hard.q;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QueensNTest {

  private QueensN queensN;

  @Before
  public void setUp() {
    queensN = new QueensN();
  }

  @Test
  public void solveNQueens() {
    // test input
    int n = 4;

    // set expected value
    List<List<String>> expected = new ArrayList<>();
    expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
    expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));

    // perform test
    List<List<String>> actual = queensN.solveNQueens(n);

    // assertion
    assertEquals(expected, actual);
  }
}
