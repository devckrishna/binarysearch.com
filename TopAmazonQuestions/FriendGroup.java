import java.util.*;

public class FriendGroup {
  public void helper(Map<Integer, int[]> graph, int src, boolean[] visited) {
    if (visited[src]) {
      return;
    }
    visited[src] = true;
    for (int nei : graph.get(src)) {
      if (!visited[nei]) {
        helper(graph, nei, visited);
      }
    }
  }

  public int solve(int[][] friends) {
    Map<Integer, int[]> graph = new HashMap<>();
    int index = 0;
    for (int[] friend : friends) {
      graph.put(index, friend);
      index++;
    }
    boolean[] visited = new boolean[friends.length];
    int ans = 0;
    for (int i = 0; i < friends.length; i++) {
      if (!visited[i]) {
        helper(graph, i, visited);
        ans++;
      }
    }
    return ans;
  }
}
