package easy.m;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jsong on 2019-05-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Easy - Meeting Rooms (https://leetcode.com/problems/meeting-rooms/)
 */
public class MeetingRooms {
  public boolean canAttendMeetings(int[][] intervals) {
    if (intervals.length == 0) {
      return true;
    }

    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

    int[] prev = intervals[0];
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < prev[1]) {
        return false;
      }
      prev = intervals[i];
    }

    return true;
  }
}
