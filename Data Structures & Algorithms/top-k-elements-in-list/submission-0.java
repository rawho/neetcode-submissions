class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((e1, e2) -> freq.get(e1) - freq.get(e2));

        for(int num : nums){
            freq.merge(num, 1, Integer::sum);
        }

        for(int key : freq.keySet()){
            minHeap.offer(key);
            if(minHeap.size() > k){
                minHeap.poll();
            }
            
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = minHeap.poll();
        }

        return res;


    }
}
