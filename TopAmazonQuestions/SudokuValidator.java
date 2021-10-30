import java.util.*;

public class SudokuValidator {
  public boolean solve(int[][] matrix) {
    Set<String> set = new HashSet<>();
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] > 9 || matrix[i][j] < 1) {
          return false;
        }
        String curr = "(" + matrix[i][j] + ")";
        if (!set.add(i + curr) || !set.add(curr + j) || !set.add(i / 3 + curr + j / 3)) {
          return false;
        }
      }
    }
    return true;
  }
}
