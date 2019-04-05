package medium.p;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermutationsTwoTest {

  private PermutationsTwo permutationsTwo;

  @Before
  public void setUp() {
    permutationsTwo = new PermutationsTwo();
  }

  @Test
  public void permuteUnique() {}

  @Test
  public void test1PermuteUnique() {
    // test input
    int[] nums = {1, 1, 2};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 1, 2));
    expected.add(Arrays.asList(1, 2, 1));
    expected.add(Arrays.asList(2, 1, 1));

    // perform test
    List<List<Integer>> actual = permutationsTwo.permuteUnique(nums);

    // assertion
    assertEquals(expected.size(), actual.size());
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test2PermuteUnique() {
    // test input
    int[] nums = {1, 2, 3};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 2, 3));
    expected.add(Arrays.asList(1, 3, 2));
    expected.add(Arrays.asList(2, 1, 3));
    expected.add(Arrays.asList(2, 3, 1));
    expected.add(Arrays.asList(3, 1, 2));
    expected.add(Arrays.asList(3, 2, 1));

    // perform test
    List<List<Integer>> actual = permutationsTwo.permuteUnique(nums);

    // assertion
    assertEquals(expected.size(), actual.size());
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test3PermuteUnique() {
    // test input
    int[] nums = {1, 1, 2, 3};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 1, 2, 3));
    expected.add(Arrays.asList(1, 1, 3, 2));
    expected.add(Arrays.asList(1, 2, 1, 3));
    expected.add(Arrays.asList(1, 2, 3, 1));
    expected.add(Arrays.asList(1, 3, 1, 2));
    expected.add(Arrays.asList(1, 3, 2, 1));
    expected.add(Arrays.asList(2, 1, 1, 3));
    expected.add(Arrays.asList(2, 1, 3, 1));
    expected.add(Arrays.asList(2, 3, 1, 1));
    expected.add(Arrays.asList(3, 1, 1, 2));
    expected.add(Arrays.asList(3, 1, 2, 1));
    expected.add(Arrays.asList(3, 2, 1, 1));

    // perform test
    List<List<Integer>> actual = permutationsTwo.permuteUnique(nums);

    // assertion
    assertEquals(expected.size(), actual.size());
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test4PermuteUnique() {
    // test input
    int[] nums = {2, 2, 1, 1};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 1, 2, 2));
    expected.add(Arrays.asList(1, 2, 1, 2));
    expected.add(Arrays.asList(1, 2, 2, 1));
    expected.add(Arrays.asList(2, 1, 1, 2));
    expected.add(Arrays.asList(2, 1, 2, 1));
    expected.add(Arrays.asList(2, 2, 1, 1));

    // perform test
    List<List<Integer>> actual = permutationsTwo.permuteUnique(nums);

    // assertion
    assertEquals(expected.size(), actual.size());
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }

  @Test
  public void test5PermuteUnique() {
    // test input
    int[] nums = {1, 1, 1, 2};

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 1, 1, 2));
    expected.add(Arrays.asList(1, 1, 2, 1));
    expected.add(Arrays.asList(1, 2, 1, 1));
    expected.add(Arrays.asList(2, 1, 1, 1));

    // perform test
    List<List<Integer>> actual = permutationsTwo.permuteUnique(nums);

    // assertion
    assertEquals(expected.size(), actual.size());
    assertTrue(expected.containsAll(actual));
    assertTrue(actual.containsAll(expected));
  }
}
