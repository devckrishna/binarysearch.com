public class RainChecker {
  public int solve(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    left[0] = -1;
    for (int i = 1; i < nums.length; i++) {
      left[i] = Math.max(left[i - 1], nums[i - 1]);
    }
    right[right.length - 1] = -1;
    for (int i = right.length - 2; i >= 0; i--) {
      right[i] = Math.max(right[i + 1], nums[i + 1]);
    }
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      int diff = Math.min(right[i], left[i]) - nums[i];
      if (diff > 0) {
        ans += diff;
      }
    }
    return ans;
  }
}
