public class GameOfLife {
  public boolean check(int[][] arr, int i, int j) {
    if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) {
      return false;
    }
    return true;
  }

  public int nei(int[][] arr, int i, int j) {
    int ans = 0;
    if (check(arr, i + 1, j)) {
      ans += arr[i + 1][j];
    }
    if (check(arr, i - 1, j)) {
      ans += arr[i - 1][j];
    }
    if (check(arr, i, j + 1)) {
      ans += arr[i][j + 1];
    }
    if (check(arr, i, j - 1)) {
      ans += arr[i][j - 1];
    }
    if (check(arr, i + 1, j + 1)) {
      ans += arr[i + 1][j + 1];
    }
    if (check(arr, i + 1, j - 1)) {
      ans += arr[i + 1][j - 1];
    }
    if (check(arr, i - 1, j - 1)) {
      ans += arr[i - 1][j - 1];
    }
    if (check(arr, i - 1, j + 1)) {
      ans += arr[i - 1][j + 1];
    }
    return ans;
  }

  public int[][] solve(int[][] arr) {
    int[][] ans = new int[arr.length][arr[0].length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        int curr = nei(arr, i, j);
        if (arr[i][j] == 1 && (curr == 2 || curr == 3)) {
          ans[i][j] = 1;
        } else if (arr[i][j] == 0 && curr == 3) {
          ans[i][j] = 1;
        } else {
          ans[i][j] = 0;
        }
      }
    }
    return ans;
  }
}
