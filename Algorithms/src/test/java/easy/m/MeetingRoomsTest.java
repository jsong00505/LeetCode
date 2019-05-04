package easy.m;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomsTest {

  private MeetingRooms meetingRooms;

  @Before
  public void setUp() {
    meetingRooms = new MeetingRooms();
  }

  @Test
  public void test1CanAttendMeetings() {
    // test data
    int[][] intervals = new int[][] {{6, 10}, {13, 14}, {12, 14}};

    // set expected value
    boolean expected = false;

    // perform test
    boolean actual = meetingRooms.canAttendMeetings(intervals);

    // assertion
    assertEquals(expected, actual);
  }
}
