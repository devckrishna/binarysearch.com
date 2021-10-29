public class NumberOfIslands {
  public void helper(int[][] arr, int i, int j) {
    if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0) {
      return;
    }
    arr[i][j] = 0;
    helper(arr, i + 1, j);
    helper(arr, i - 1, j);
    helper(arr, i, j + 1);
    helper(arr, i, j - 1);
  }

  public int solve(int[][] matrix) {
    int ans = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 1) {
          helper(matrix, i, j);
          ans++;
        }
      }
    }
    return ans;
  }
}
