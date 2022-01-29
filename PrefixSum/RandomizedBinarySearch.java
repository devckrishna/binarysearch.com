public class RandomizedBinarySearch {
  public int solve(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int ans = 0;
    left[0] = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[left[i - 1]] < nums[i]) {
        left[i] = i;
      } else {
        left[i] = left[i - 1];
      }
    }
    right[right.length - 1] = nums.length - 1;

    for (int i = right.length - 2; i >= 0; i--) {
      if (nums[right[i + 1]] > nums[i]) {
        right[i] = i;
      } else {
        right[i] = right[i + 1];
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (left[i] == i && right[i] == i) {
        ans++;
      }
    }

    return ans;
  }
}
