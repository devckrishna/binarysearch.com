public class LongestMatrixPathLength {
  public int solve(int[][] matrix) {
    int[][] dp = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < dp[0].length; i++) {
      dp[matrix.length - 1][i] = 1;
    }
    for (int i = dp.length - 2; i >= 0; i--) {
      for (int j = 0; j < dp[0].length; j++) {
        if (matrix[i][j] == 1) {
          continue;
        }
        if (j == 0) {
          dp[i][j] = 1 + dp[i + 1][j];
        } else {
          dp[i][j] = 1 + Math.max(dp[i + 1][j], dp[i][j - 1]);
        }
      }
    }
    int max = 0;
    for (int i = 0; i < dp[0].length; i++) {
      max = Math.max(max, dp[0][i]);
    }
    return max;
  }
}
