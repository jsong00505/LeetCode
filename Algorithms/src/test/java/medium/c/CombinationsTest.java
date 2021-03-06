package medium.c;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationsTest {

  private Combinations combinations;

  @Before
  public void setUp() {
    combinations = new Combinations();
  }

  @Test
  public void test1Combine() {
    // test input
    int n = 4;
    int k = 2;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1, 2));
    expected.add(Arrays.asList(1, 3));
    expected.add(Arrays.asList(1, 4));
    expected.add(Arrays.asList(2, 3));
    expected.add(Arrays.asList(2, 4));
    expected.add(Arrays.asList(3, 4));

    // perform test
    List<List<Integer>> actual = combinations.combine(n, k);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Combine() {
    // test input
    int n = 0;
    int k = 0;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(new ArrayList<>());

    // perform test
    List<List<Integer>> actual = combinations.combine(n, k);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Combine() {
    // test input
    int n = 5;
    int k = 1;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(1));
    expected.add(Arrays.asList(2));
    expected.add(Arrays.asList(3));
    expected.add(Arrays.asList(4));
    expected.add(Arrays.asList(5));

    // perform test
    List<List<Integer>> actual = combinations.combine(n, k);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Combine() {
    // test input
    int n = 1;
    int k = 5;

    // set expected value
    List<List<Integer>> expected = new ArrayList<>();

    // perform test
    List<List<Integer>> actual = combinations.combine(n, k);

    // assertion
    assertEquals(expected, actual);
  }
}
