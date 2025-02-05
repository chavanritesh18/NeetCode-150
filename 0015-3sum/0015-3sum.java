class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         // Result list to store unique triplets
        List<List<Integer>> al = new ArrayList<>();

        // Sort the array to enable two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array (first element of the triplet)
        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize two pointers: left (next element) and right (last element)
            int left = i + 1, right = nums.length - 1;

            // Use two-pointer approach to find pairs that sum to -nums[i]
            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];

                if (threeSum > 0) {
                    // If sum is greater than 0, decrease right pointer
                    right--;
                } else if (threeSum < 0) {
                    // If sum is less than 0, increase left pointer
                    left++;
                } else {
                    // Found a valid triplet, add to result list
                    al.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers to find new pairs
                    left++;
                    right--;

                    // Skip duplicate elements to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }

        // Return the list of triplets
        return al;
    }
}