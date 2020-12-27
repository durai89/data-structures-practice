class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    int maxSum = 0, windowSum = 0;
    for (int i=0; i < arr.length - k; i++) {
      windowSum = 0;
      for (int j=i; j < i + k; j++) {
        windowSum += arr[j];
      }
      maxSum = Math.max(maxSum, windowSum);      
    }
    return maxSum;
  }
}
