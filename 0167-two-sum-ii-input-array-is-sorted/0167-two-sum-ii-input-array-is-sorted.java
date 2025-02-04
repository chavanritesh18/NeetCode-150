class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // Initialize two pointers: 
        // 'start' at the beginning of the array and 'end' at the last element
        int start  = 0 , end   = numbers.length - 1;

        // Use the two-pointer approach to find the pair that sums up to the target
        while(start < end) {
            int currentSum  = numbers[start] + numbers[end];

            // If the current sum is greater than the target, move the 'end' pointer left
            if(currentSum > target) {
                end--;
            }
            // If the current sum is smaller than the target, move the 'start' pointer right
            else if(currentSum < target) {
                start++;
            }
            // If the current sum matches the target, return the indices (1-based index)
            else {
                return new int[] {start + 1, end + 1};
            }
        } 

        // If no valid pair is found, return an empty array
        return new int[0];
    }
}
