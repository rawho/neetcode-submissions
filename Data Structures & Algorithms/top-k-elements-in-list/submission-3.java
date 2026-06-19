class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.merge(num, 1, Integer::sum);
        }

        List<Integer>[] count = new List[nums.length + 1];
        for(int i = 0; i<count.length; i++){
            count[i] = new ArrayList<>();
        }
        for(int key : freq.keySet()){
            count[freq.get(key)].add(key);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i = count.length - 1; i>=0 && index < k; i--){
            if(count[i].size()>0){
                for(int r : count[i]){
                    result[index++] = r;
                    if (index == k) break;
                }
            }
        }

        return result;

    }
}
