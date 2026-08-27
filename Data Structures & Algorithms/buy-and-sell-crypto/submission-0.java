class Solution {
    public int maxProfit(int[] prices) {
        int l =0,r=1,mp=0;
        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                int p = prices[r]-prices[l];
                mp= Math.max(mp,p);
            }
            else
            {
                l=r;
            }
            r++;
        }
        return mp;
    }
}
