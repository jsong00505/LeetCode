package medium.r;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
public class RotateImageTest {
  private RotateImage rotateImage = new RotateImage();
  @Test
  public void test1Rotate() {
    // test input and actual value
    int[][] actual = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    // set expected value
    int[][] expected = {
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}};
    // perform test
    rotateImage.rotate(actual);
    // assertion
    assertArrayEquals(expected, actual);
  }
  @Test
  public void test2Rotate() {
    // test input and actual value
    int[][] actual = {
            {1, 2},
            {4, 5}};
    // set expected value
    int[][] expected = {
            {4, 1},
            {5, 2}};
    // perform test
    rotateImage.rotate(actual);
    // assertion
    assertArrayEquals(expected, actual);
  }
  @Test
  public void test3Rotate() {
    // test input and actual value
    int[][] actual = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}};
    // set expected value
    int[][] expected = {
            {15, 13, 2, 5},
            {14, 3, 4, 1},
            {12, 6, 8, 9},
            {16, 7, 10, 11}};
    // perform test
    rotateImage.rotate(actual);
    // assertion
    assertArrayEquals(expected, actual);
  }
}
