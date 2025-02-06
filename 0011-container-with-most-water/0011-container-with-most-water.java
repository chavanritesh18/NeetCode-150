class Solution {
    public int maxArea(int[] heights) {
        
        int maxArea  = 0; // Variable to store the maximum area found so far

        int l = 0; // Left pointer starts from the beginning of the array
        int r  =  heights.length - 1; // Right pointer starts from the end of the array

        // Use two-pointer approach to find the maximum area
        while( l < r) 
        {
            int left  =  heights[l]; // Height of the left boundary
            int right = heights[r]; // Height of the right boundary

            // Width is determined by the distance between the two pointers (r - l)
            // Height is determined by the smaller of the two heights (left, right)
            int currentArea  =  Math.min(left , right)  * (r - l);

            // Update maxArea if we find a larger area
            maxArea =  Math.max(maxArea , currentArea);

            // Move the pointer with the smaller height to try and find a potentially larger area
            if(left < right) 
            {
                l++; // Move the left pointer to the right
            }
            else 
            {
                r--; // Move the right pointer to the left
            }
        }

        return maxArea; // Return the maximum area found
    }
}
