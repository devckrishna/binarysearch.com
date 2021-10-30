public class PaintBucket {
  public void helper(String[][] arr, int i, int j, String target, String color, boolean[][] visited) {
    if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || visited[i][j] || !arr[i][j].equals(color)) {
      return;
    }
    arr[i][j] = target;
    visited[i][j] = true;
    helper(arr, i + 1, j, target, color, visited);
    helper(arr, i, j + 1, target, color, visited);
    helper(arr, i - 1, j, target, color, visited);
    helper(arr, i, j - 1, target, color, visited);
  }

  public String[][] solve(String[][] matrix, int r, int c, String target) {
    String color = matrix[r][c];
    boolean[][] visited = new boolean[matrix.length][matrix[0].length];
    helper(matrix, r, c, target, color, visited);

    return matrix;
  }
}
