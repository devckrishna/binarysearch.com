class WolfOfWallStreet {
  public int solve(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int[] arr = new int[prices.length];
    int ans = 0;
    arr[prices.length - 1] = prices[prices.length - 1];
    for (int i = prices.length - 2; i >= 0; i--) {
      arr[i] = Math.max(prices[i], arr[i + 1]);
    }
    for (int i = 0; i < arr.length; i++) {
      ans = Math.max(ans, arr[i] - prices[i]);
    }
    return ans;
  }
}