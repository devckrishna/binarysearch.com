public class RangeSumMatrix {
  int[][] arr;

  public RangeSumMatrix(int[][] matrix) {
    arr = new int[matrix.length][matrix[0].length + 1];
    for (int i = 0; i < matrix.length; i++) {
      arr[i][0] = 0;
      for (int j = 1; j < arr[0].length; j++) {
        arr[i][j] = arr[i][j - 1] + matrix[i][j - 1];
      }
    }
  }

  public int total(int row0, int col0, int row1, int col1) {
    int ans = 0;
    for (int i = row0; i <= row1; i++) {
      ans += arr[i][col1 + 1] - arr[i][col0];
    }
    return ans;
  }
}
