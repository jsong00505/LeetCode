package medium.p;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {

  private Permutations permutations;

  @Before
  public void setUp() {
    permutations = new Permutations();
  }

  @Test
  public void test1Permute() {
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
    List<List<Integer>> actual = permutations.permute(nums);

    // assertion
    assertEquals(expected, actual);
  }
}
