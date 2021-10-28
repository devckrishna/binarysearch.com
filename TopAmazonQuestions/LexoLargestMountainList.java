public class LexoLargestMountainList {
  public int[] solve(int n, int lower, int upper) {
    int[] ans = new int[n];
    if ((upper - lower) * 2 + 1 < n) {
      return new int[] {};
    }
    int diff = 1;
    int curr = upper - lower;
    if (curr < n) {
      diff = n - curr - 1;
    }
    if (diff == 0) {
      diff = 1;
    }
    boolean flag = false;
    int inital = upper - diff;
    for (int i = 0; i < n; i++) {
      if (diff <= 0) {
        flag = true;
      }
      ans[i] = inital;
      if (flag) {
        inital--;
      } else {
        inital++;
      }
      diff--;
    }
    return ans;
  }
}
