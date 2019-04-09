package medium.m;

import common.Interval;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeIntervalsTest {

  private MergeIntervals mergeIntervals;

  @Before
  public void setUp() {
    mergeIntervals = new MergeIntervals();
  }

  @Test
  public void test1Merge() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(2, 6));
    intervals.add(new Interval(8, 10));
    intervals.add(new Interval(15, 18));

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(1, 6));
    expected.add(new Interval(8, 10));
    expected.add(new Interval(15, 18));

    // perform test
    List<Interval> actual = mergeIntervals.merge(intervals);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Merge() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 4));
    intervals.add(new Interval(4, 5));

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(1, 5));

    // perform test
    List<Interval> actual = mergeIntervals.merge(intervals);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Merge() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(2, 3));
    intervals.add(new Interval(4, 5));
    intervals.add(new Interval(6, 7));
    intervals.add(new Interval(8, 9));
    intervals.add(new Interval(1, 10));

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(1, 10));

    // perform test
    List<Interval> actual = mergeIntervals.merge(intervals);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test4Merge() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(2, 3));
    intervals.add(new Interval(5, 5));
    intervals.add(new Interval(2, 2));
    intervals.add(new Interval(3, 4));
    intervals.add(new Interval(3, 4));

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(2, 4));
    expected.add(new Interval(5, 5));

    // perform test
    List<Interval> actual = mergeIntervals.merge(intervals);

    // assertion
    assertEquals(expected, actual);
  }
}
