class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for(int right = 0; right < nums.length; right++){
            if(!seen.add(nums[right])){
                return true;
            }

            if(right >= k){
                seen.remove(nums[right -k]);
            }
        }

        return false;
    }
}