package medium.s;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortColorsTest {

  private SortColors sortColors;

  @Before
  public void setUp() {
    sortColors = new SortColors();
  }

  @Test
  public void test1SortColors() {
    // test input
    int[] actual = {2, 0, 2, 1, 1, 0};

    // set expected value
    int[] expected = {0, 0, 1, 1, 2, 2};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test2SortColors() {
    // test input
    int[] actual = {0, 0, 1, 0, 1, 1, 1, 2, 2};

    // set expected value
    int[] expected = {0, 0, 0, 1, 1, 1, 1, 2, 2};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test3SortColors() {
    // test input
    int actual[] = {2, 0, 1};

    // set expected value
    int[] expected = {0, 1, 2};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test4SortColors() {
    // test input
    int[] actual = {};

    // set expected value
    int[] expected = {};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test5SortColors() {
    // test input
    int[] actual = {0};

    // set expected value
    int[] expected = {0};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test6SortColors() {
    // test input
    int[] actual = {1};

    // set expected value
    int[] expected = {1};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test7SortColors() {
    // test input
    int[] actual = {2};

    // set expected value
    int[] expected = {2};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }

  @Test
  public void test8SortColors() {
    // test input
    int[] actual = {0, 2, 1};

    // set expected value
    int[] expected = {0, 1, 2};

    // perform test
    sortColors.sortColors(actual);

    // assertion
    assertArrayEquals(expected, actual);
  }
}
