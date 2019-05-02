package medium.r;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReconstructItineraryTest {

  private ReconstructItinerary reconstructItinerary;

  @Before
  public void setUp() {
    reconstructItinerary = new ReconstructItinerary();
  }

  @Test
  public void test1FindItinerary() {
    // test input
    List<List<String>> tickets = new ArrayList<>();
    tickets.add(Arrays.asList("MUC", "LHR"));
    tickets.add(Arrays.asList("JFK", "MUC"));
    tickets.add(Arrays.asList("SFO", "SJC"));
    tickets.add(Arrays.asList("LHR", "SFO"));

    // set expected value
    List<String> expected = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");

    // perform test
    List<String> actual = reconstructItinerary.findItinerary(tickets);

    // assertion
    assertEquals(expected, actual);
  }

  @Test
  public void test2indItinerary() {
    // test input
    List<List<String>> tickets = new ArrayList<>();
    tickets.add(Arrays.asList("JFK", "KUL"));
    tickets.add(Arrays.asList("JFK", "NRT"));
    tickets.add(Arrays.asList("NRT", "JFK"));

    // set expected value
    List<String> expected = Arrays.asList("JFK", "NRT", "JFK", "KUL");

    // perform test
    List<String> actual = reconstructItinerary.findItinerary(tickets);

    // assertion
    assertEquals(expected, actual);
  }
}
