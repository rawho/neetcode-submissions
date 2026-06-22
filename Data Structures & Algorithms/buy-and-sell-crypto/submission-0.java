class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int res = 0;
        for(int right = 0; right < prices.length; right++){
            int profit = prices[right] - prices[left];
            res = Math.max(res, profit);
            if(prices[right] < prices[left]){
                left = right;
            }
        }

        return res;
    }
}
