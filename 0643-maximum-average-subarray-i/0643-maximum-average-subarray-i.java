class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int sum = 0;
        
        // Compute the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];  // Add new element, remove old one
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;  // Return maximum average
    }
}