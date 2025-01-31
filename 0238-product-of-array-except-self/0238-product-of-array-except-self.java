class Solution {
    public int[] productExceptSelf(int[] nums) {
        
    //     nums  =  1 2 3 4

    //    prefixSum  =  1 1 2 6
        
    //    suffixSum  =  24 12 4 1

    //     ans  = [24 , 12 ,8 , 6]
 

        // Creating array for storing the prefixsum
        int [] prefixSum  = new int[nums.length];

        // Creating the array for storing the suffixsum
        int [] suffixSum     = new int[nums.length];

        // store the product 1 at 0th index bcoz 
        // there is no element of its left hand side
        prefixSum[0] = 1;
        
        // Creating the prefixSum array
        for(int i  = 1; i < nums.length; i++)
        {
            // adding at ith position : product of  i - 1th element of prefixSum and nums array
            prefixSum[i] = prefixSum[i-1] * nums[i-1];
        }

        // storing at last index value  = 1
        // bcoz there is no right element after that
        suffixSum[nums.length - 1] = 1;

        // Creating the suffixSum array
        for(int i  =  suffixSum.length - 2; i >= 0; i--)
        {
            // adding from the second last index : product of i + 1th element of the suffixSum and the nums 
            suffixSum[i] = suffixSum[i+1] * nums[i+1];
        }
        
        // creating new array to store the final ans
        int ans [] = new int [nums.length];

        // adding the product of prefix[i] * suffix[i]
        for(int i  = 0; i < nums.length; i++)
        {
            ans[i] = prefixSum[i] * suffixSum[i];
        }

        // returning the ans array
        return ans;


    }
}