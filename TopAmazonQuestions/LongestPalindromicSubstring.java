public class LongestPalindromicSubstring {
  public int solve(String s) {
    boolean[][] dp = new boolean[s.length()][s.length()];
    int ans = 0;
    for (int g = 0; g < dp.length; g++) {
      for (int i = 0, j = g; j < dp.length; i++, j++) {
        if (g == 0) {
          dp[i][j] = true;
        } else if (g == 1) {
          dp[i][j] = s.charAt(i) == s.charAt(j);
        } else {
          dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
        }
        if (dp[i][j]) {
          ans = Math.max(ans, g + 1);
        }
      }
    }

    return ans;
  }
}
