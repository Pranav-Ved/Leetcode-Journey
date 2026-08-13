class Solution {
    public int maxProfit(int[] prices) {
       int mp = prices[0];
       int mxp = 0;
       for (int i = 1; i < prices.length ; i++){
        if (prices[i] < mp){
            mp = prices[i];
        }
        else if ((prices[i] - mp) > mxp){
            mxp = prices[i] - mp; 
        }
       }
       return mxp;
    }
}