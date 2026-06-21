class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(right - left > k){
                seen.remove(nums[left]);
                left++;
            }
            if(!seen.add(nums[right])){
                return true;
            }
        }

        return false;
    }
}