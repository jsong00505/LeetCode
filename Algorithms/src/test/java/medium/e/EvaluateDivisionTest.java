package medium.e;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class EvaluateDivisionTest {

  private EvaluateDivision evaluateDivision;

  @Before
  public void setUp() {
    evaluateDivision = new EvaluateDivision();
  }

  @Test
  public void calcEquation() {
    // test input
    List<List<String>> equations = new ArrayList<>();
    equations.add(Arrays.asList("a", "e"));
    equations.add(Arrays.asList("b", "e"));
    double[] values = new double[] {4.0, 3.0};
    List<List<String>> queries = new ArrayList<>();
    queries.add(Arrays.asList("a", "b"));
    queries.add(Arrays.asList("e", "e"));
    queries.add(Arrays.asList("x", "x"));

    // set expected value
    double[] expected = new double[] {4.0 / 3.0, 1.0, -1.0};

    // perform test
    double[] actual = evaluateDivision.calcEquation(equations, values, queries);

    // assertion
    assertArrayEquals(expected, actual, 0.00001);
  }
}
