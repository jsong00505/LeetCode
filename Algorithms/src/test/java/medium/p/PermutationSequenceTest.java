package medium.p;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PermutationSequenceTest {

  private PermutationSequence permutationSequence;

  @Before
  public void setUp() {
    permutationSequence = new PermutationSequence();
  }

  @Test
  public void test1GetPermutation() {
    // test input
    int n = 3;
    int k = 2;

    // set expected value
    String expected = "132";

    // perform test
    String actual = permutationSequence.getPermutation(n, k);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2GetPermutation() {
    // test input
    int n = 4;
    int k = 9;

    // set expected value
    String expected = "2314";

    // perform test
    String actual = permutationSequence.getPermutation(n, k);

    // assertion
    assertEquals(expected, actual);
  }
}
