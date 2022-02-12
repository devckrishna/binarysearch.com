public class DiceThrow {
  int mod = (int) 1e9 + 7;

  public int solve(int n, int faces, int total) {
    Integer[][] dp = new Integer[n + 1][total + 1];
    return helper(n, faces, total, 0, dp);
  }

  public int helper(int n, int faces, int total, int sum, Integer[][] dp) {
    if (n == 0 && total == sum) {
      return 1;
    }
    if (n < 0 || sum > total) {
      return 0;
    }
    if (dp[n][sum] != null) {
      return dp[n][sum];
    }
    int ans = 0;

    for (int i = 1; i <= faces; i++) {
      ans += helper(n - 1, faces, total, sum + i, dp) % mod;
      ans %= mod;
    }
    return dp[n][sum] = ans;
  }
}
