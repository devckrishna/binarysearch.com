import java.util.PriorityQueue;

public class RevolvingDorr {
  public int[][] solve(int[][] requests) {
    PriorityQueue<Integer> inQueue = new PriorityQueue<>();
    PriorityQueue<Integer> outQueue = new PriorityQueue<>();
    for (int i = requests.length - 1; i >= 0; i--) {
      if (requests[i][1] == 0) {
        outQueue.add(requests[i][0]);
      } else {
        inQueue.add(requests[i][0]);
      }
    }
    int[][] result = new int[requests.length][2];
    int time = -1;
    int door = 1;
    for (int i = 0; i < requests.length; i++) {
      if (inQueue.size() == 0 || outQueue.size() != 0 && outQueue.peek() < inQueue.peek()) {
        time = Math.max(time + 1, outQueue.poll());
        result[i] = new int[] { time, 0 };
        door = 0;
      } else if (outQueue.size() == 0 || inQueue.peek() < outQueue.peek()) {
        time = Math.max(time + 1, inQueue.poll());
        result[i] = new int[] { time, 1 };
        door = 1;
      } else {
        if (inQueue.peek() - time > 1) {
          door = 1;
        }
        if (door == 1) {
          time = Math.max(time + 1, inQueue.poll());
          result[i] = new int[] { time, 1 };
        } else {
          time = Math.max(time + 1, outQueue.poll());
          result[i] = new int[] { time, 0 };
        }
      }
    }
    return result;
  }
}
