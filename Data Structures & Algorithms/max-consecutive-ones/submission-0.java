class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int curr_max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                result += 1;
            }else{
                curr_max = Math.max(result, curr_max);
                result = 0;
            }
        }

        result = Math.max(result, curr_max);
        return result;
    }
}