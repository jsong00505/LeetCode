package hard.l;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LargestRectangleInHistogramTest {

  private LargestRectangleInHistogram largestRectangleInHistogram;

  @Before
  public void setUp() {
    largestRectangleInHistogram = new LargestRectangleInHistogram();
  }

  @Test
  public void test1LargestRectangleArea() {
    // test input
    int[] heights = new int[]{2, 1, 5, 6, 2, 3};

    // expected value
    int expected = 10;

    // perform test
    int actual = largestRectangleInHistogram.largestRectangleArea(heights);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2LargestRectangleArea() {
    // test input
    int[] heights = new int[]{2};

    // expected value
    int expected = 2;

    // perform test
    int actual = largestRectangleInHistogram.largestRectangleArea(heights);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3LargestRectangleArea() {
    // test input
    int[] heights = new int[]{};

    // expected value
    int expected = 0;

    // perform test
    int actual = largestRectangleInHistogram.largestRectangleArea(heights);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4LargestRectangleArea() {
    // test input
    int[] heights = new int[]{2, 1, 2};

    // expected value
    int expected = 3;

    // perform test
    int actual = largestRectangleInHistogram.largestRectangleArea(heights);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test5LargestRectangleArea() {
    // test input
    int[] heights = new int[]{6, 2, 5, 4, 5, 1, 6};

    // expected value
    int expected = 12;

    // perform test
    int actual = largestRectangleInHistogram.largestRectangleArea(heights);

    // assertion
    assertEquals(expected, actual);
  }
}
