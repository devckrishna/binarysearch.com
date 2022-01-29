public class LongestConsecutiveSubList {
  public int solve(int[] nums) {
    int n = nums.length;
    if (n <= 1)
      return n;
    int res = 1;
    for (int i = 0; i < n; i++) {
      int min = nums[i];
      int max = nums[i];
      for (int r = i; r < n; r++) {
        min = Math.min(min, nums[r]);
        max = Math.max(max, nums[r]);
        if (max - min + 1 == r - i + 1) {
          res = Math.max(res, r - i + 1);
        }
      }
    }
    return res;
  }
}
