package medium.c;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CombinationSumTest {

  private CombinationSum combinationSum;

  @Before
  public void setUp() {
    combinationSum = new CombinationSum();
  }

  @Test
  public void test1CombinationSum() {
    // test input
    int[] candidates = {2, 3, 6, 7};
    int target = 7;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(2, 2, 3));
    expected.add(Arrays.asList(7));

    // perform test
    List<List<Integer>> actual = combinationSum.combinationSum(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test2CombinationSum() {
    // test input
    int[] candidates = {4, 2, 8};
    int target = 8;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(2, 2, 2, 2));
    expected.add(Arrays.asList(2, 2, 4));
    expected.add(Arrays.asList(4, 4));
    expected.add(Arrays.asList(8));

    // perform test
    List<List<Integer>> actual = combinationSum.combinationSum(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }
}
