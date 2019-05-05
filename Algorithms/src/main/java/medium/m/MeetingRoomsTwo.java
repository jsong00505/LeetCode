package medium.m;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by jsong on 2019-05-04.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Meeting Rooms II (https://leetcode.com/problems/meeting-rooms-ii/)
 */
public class MeetingRoomsTwo {
  public int minMeetingRooms(int[][] intervals) {
    if (intervals.length == 0) {
      return 0;
    }
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    minHeap.offer(intervals[0][1]);
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] >= minHeap.peek()) {
        minHeap.poll();
      }
      minHeap.offer(intervals[i][1]);
    }
    return minHeap.size();
  }
}
