class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] postfix = new int[height.length];
        prefix[0] = height[0];
        postfix[height.length-1] = height[height.length - 1];
        for(int i = 1; i<height.length; i++){
            prefix[i] = Math.max(height[i], prefix[i-1]);
        }
        for(int i = height.length-2; i >=0; i--){
            postfix[i] = Math.max(height[i], postfix[i+1]);
        }

        int area = 0;
        for(int i = 0; i<height.length; i++){
            int areaAtPoint =  Math.min(prefix[i], postfix[i]) - height[i];
            if(areaAtPoint > 0){
                area += areaAtPoint;
            }
        }

        return area;
    }
}
