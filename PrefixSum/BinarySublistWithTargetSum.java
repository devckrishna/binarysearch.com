public class BinarySublistWithTargetSum {
  public int solve(int[] nums, int target) {
    int[] arr = new int[nums.length + 1];
    arr[0] = 1;
    int prefixSum = 0;
    int ans = 0;
    for (int num : nums) {
      prefixSum += num;
      if (prefixSum >= target) {
        ans += arr[prefixSum - target];
      }
      arr[prefixSum]++;
    }
    return ans;
  }
}
