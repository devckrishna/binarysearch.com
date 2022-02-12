import java.util.*;

public class MovieTheatres {
  public int solve(int[][] intervals) {
    if (intervals.length == 0) {
      return 0;
    }
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    pq.add(intervals[0]);
    for (int i = 1; i < intervals.length; i++) {
      int[] curr = pq.poll();
      if (curr[1] <= intervals[i][0]) {
        curr[1] = intervals[i][1];
        pq.add(curr);
      } else {
        pq.add(curr);
        pq.add(intervals[i]);
      }
    }
    return pq.size();
  }
}
