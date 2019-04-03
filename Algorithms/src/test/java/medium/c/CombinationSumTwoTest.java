package medium.c;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CombinationSumTwoTest {

  private CombinationSumTwo combinationSumTwo;

  @Before
  public void setUp() {
    combinationSumTwo = new CombinationSumTwo();
  }

  @Test
  public void test1CombinationSum2() {
    // test input
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 7));
    expected.add(Arrays.asList(1, 2, 5));
    expected.add(Arrays.asList(2, 6));
    expected.add(Arrays.asList(1, 1, 6));

    // perform test
    List<List<Integer>> actual = combinationSumTwo.combinationSum2(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test2CombinationSum2() {
    // test input
    int[] candidates = {2, 5, 2, 1, 2};
    int target = 5;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 2, 2));
    expected.add(Arrays.asList(5));

    // perform test
    List<List<Integer>> actual = combinationSumTwo.combinationSum2(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test3CombinationSum2() {
    // test input
    int[] candidates = {2};
    int target = 5;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();

    // perform test
    List<List<Integer>> actual = combinationSumTwo.combinationSum2(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test4CombinationSum2() {
    // test input
    int[] candidates = {5};
    int target = 5;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(5));

    // perform test
    List<List<Integer>> actual = combinationSumTwo.combinationSum2(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test5CombinationSum2() {
    // test input
    int[] candidates = {};
    int target = 5;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();

    // perform test
    List<List<Integer>> actual = combinationSumTwo.combinationSum2(candidates, target);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }
}
