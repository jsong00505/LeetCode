package medium.m;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

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
