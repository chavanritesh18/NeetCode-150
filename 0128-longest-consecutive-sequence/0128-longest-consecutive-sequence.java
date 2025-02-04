class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();


        for(int num  : nums)
        {
            hs.add(num);
        }

        int longestLength = 0;

        for(int num : hs)
        {
            int currentLength  = 1;

            if(!hs.contains(num-1))
            {
                while(hs.contains(num+1))
                {
                    currentLength++;
                }

                longestLength  =  Math.max(currentLength,longestLength);
            }

        }
        return longestLength;

    }
}