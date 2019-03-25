package hard.m;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MedianOfTwoSortedArraysTest {
  private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

  @Before
  public void setUp() {
    medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
  }

  @Test
  public void test1FindMedianSortedArrays() {
    // test inputs
    int[] nums1 = {1, 3};
    int[] nums2 = {2};

    // set expected values
    double expected = 2.0;

    // perform test
    double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

    // assertions
    assertEquals(expected, actual, 0.1);
  }

  @Test
  public void test2FindMedianSortedArrays() {
    // test inputs
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};

    // set expected values
    double expected = 2.5;

    // perform test
    double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

    // assertions
    assertEquals(expected, actual, 0.1);
  }

  @Test
  public void test3FindMedianSortedArrays() {
    // test inputs
    int[] nums1 = {1, 2, 3, 5};
    int[] nums2 = {3, 4};

    // set expected values
    double expected = 3.0;

    // perform test
    double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

    // assertions
    assertEquals(expected, actual, 0.1);
  }

  @Test
  public void test4FindMedianSortedArrays() {
    // test inputs
    int[] nums1 = {1, 2, 3, 5, 7, 10};
    int[] nums2 = {3, 4, 6};

    // set expected values
    double expected = 4.0;

    // perform test
    double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

    // assertions
    assertEquals(expected, actual, 0.1);
  }

  @Test
  public void test5FindMedianSortedArrays() {
    // test inputs
    int[] nums1 = {1, 2, 3, 5, 7, 10};
    int[] nums2 = {};

    // set expected values
    double expected = 4.0;

    // perform test
    double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

    // assertions
    assertEquals(expected, actual, 0.1);
  }
}