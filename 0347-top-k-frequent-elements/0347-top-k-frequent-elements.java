class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // If the number of unique elements is equal to k, return the array as is
        if (nums.length == k) {
            return nums;
        }

        // HashMap to store the frequency of each element in the array

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count the frequency of each element in the nums array

        for (int i = 0; i < nums.length; i++) {

            // Update the frequency count in the HashMap

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // PriorityQueue (Min Heap) to store the numbers based on their frequency

        // The comparator (a, b) -> hm.get(a) - hm.get(b) sorts the heap by frequency (min heap)

        Queue<Integer> heap = new PriorityQueue<>(

            (a, b) -> hm.get(a) - hm.get(b)  // Min heap based on frequency
        );

        // Add each number from the HashMap into the heap

        for (int num : hm.keySet()) {

            heap.add(num);  // Add the number to the heap
            
            // If the size of the heap exceeds 'k', remove the least frequent element

            if (heap.size() > k) {
                heap.poll();  // Remove the element with the smallest frequency
            }
        }

        // Prepare an array to store the 'k' most frequent elements

        int[] ans = new int[k];

        // Extract the 'k' most frequent elements from the heap

        for (int i = 0; i < k; i++) {

            ans[i] = heap.poll();  // Poll (remove) elements from the heap to form the answer
        }
        
        // Return the result array containing the 'k' most frequent elements
        
        return ans;
    }
}
