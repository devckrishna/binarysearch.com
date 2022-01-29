import java.util.*;

public class LongestPrefixSequence {
  public int solve(String[] words) {
    Arrays.sort(words);
    Map<String, Integer> map = new HashMap<>();
    int ans = 1;
    for (String word : words) {
      String temp = word.substring(0, word.length() - 1);
      if (map.containsKey(temp)) {
        map.put(word, map.get(temp) + 1);
      } else {
        map.put(word, 1);
      }
      ans = Math.max(ans, map.get(word));
    }

    return ans;
  }
}
