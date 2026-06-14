class Solution {
    public int removeElement(int[] nums, int val) {
        int right = nums.length - 1;
        int move = nums.length - 1;

        while(move >= 0){
            if(nums[move] == val){
                int temp = nums[right];
                nums[right] = nums[move];
                nums[move] = temp;
                right--;
                move--;
            } else{
                move--;
            }
        }

        return right+1;
    }
}