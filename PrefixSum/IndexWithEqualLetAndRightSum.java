public class IndexWithEqualLetAndRightSum {
  public int solve(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    int leftSum = 0;
    int rightSum = sum - nums[0];
    if (leftSum == rightSum) {
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      rightSum -= nums[i];
      leftSum += nums[i - 1];
      if (leftSum == rightSum) {
        return i;
      }
    }
    return -1;
  }
}
