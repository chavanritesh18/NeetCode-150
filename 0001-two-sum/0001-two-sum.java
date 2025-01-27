class Solution {
    public int[] twoSum(int[] nums, int target) {
        // creating the hashmap to store the element and index
        HashMap<Integer , Integer> hm  = new HashMap<>();

        for(int  i = 0 ; i < nums.length; i++)
        {
            // calculating the complement of the current number
            int complement  = target  - nums[i];

             // check if the complement is present in hashmap
             if(hm.containsKey(complement))
             {
                // if it is there return the complement and the current element
                return new int[]{hm.get(complement) , i};
             }

             // else adding the current number and its index to the map
             hm.put(nums[i] , i);
        }

        // returning the empty array if no solution found
        return new int[]{};
    }
}