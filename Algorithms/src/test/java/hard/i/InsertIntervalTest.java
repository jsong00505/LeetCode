package hard.i;

import common.Interval;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InsertIntervalTest {

  private InsertInterval insertInterval;

  @Before
  public void setUp() {
    insertInterval = new InsertInterval();
  }

  @Test
  public void test1Insert() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 3));
    intervals.add(new Interval(6, 9));
    Interval newInterval = new Interval(2, 5);

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(1, 5));
    expected.add(new Interval(6, 9));

    // perform test
    List<Interval> actual = insertInterval.insert(intervals, newInterval);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2Insert() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 2));
    intervals.add(new Interval(3, 5));
    intervals.add(new Interval(6, 7));
    intervals.add(new Interval(8, 10));
    intervals.add(new Interval(12, 16));
    Interval newInterval = new Interval(4, 8);

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(1, 2));
    expected.add(new Interval(3, 10));
    expected.add(new Interval(12, 16));

    // perform test
    List<Interval> actual = insertInterval.insert(intervals, newInterval);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test3Insert() {
    // test input
    List<Interval> intervals = new ArrayList<>();
    intervals.add(new Interval(1, 5));
    Interval newInterval = new Interval(2, 7);

    // set expected value
    List<Interval> expected = new ArrayList<>();
    expected.add(new Interval(1, 7));

    // perform test
    List<Interval> actual = insertInterval.insert(intervals, newInterval);

    // assertion
    assertEquals(expected, actual);
  }
}
