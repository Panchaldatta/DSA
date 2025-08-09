class Solution {
    public int maxProfit(int[] prices) {
            int le = prices.length, maxD = 0, min = Integer.MAX_VALUE;

    for (int i = 0; i < le; i++){ 
        min = Math.min(min, prices[i]);
        maxD = Math.max(maxD, prices[i] - min);
    }

    return maxD;       
    }
}
