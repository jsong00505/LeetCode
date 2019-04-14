package medium.s;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SubsetsTest {

  private Subsets subsets;

  @Before
  public void setUp() {
    subsets = new Subsets();
  }

  @Test
  public void test1Subsets() {
    // test input
    int[] nums = new int[] {1, 2, 3};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList());
    expected.add(Arrays.asList(1));
    expected.add(Arrays.asList(2));
    expected.add(Arrays.asList(3));
    expected.add(Arrays.asList(1, 2));
    expected.add(Arrays.asList(1, 3));
    expected.add(Arrays.asList(2, 3));
    expected.add(Arrays.asList(1, 2, 3));

    // perform test
    List<List<Integer>> actual = subsets.subsets(nums);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test2Subsets() {
    // test input
    int[] nums = new int[] {};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList());

    // perform test
    List<List<Integer>> actual = subsets.subsets(nums);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test3Subsets() {
    // test input
    int[] nums = new int[] {1};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList());
    expected.add(Arrays.asList(1));

    // perform test
    List<List<Integer>> actual = subsets.subsets(nums);

    // assertion
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }
}
