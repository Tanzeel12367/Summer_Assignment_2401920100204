class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int mn=prices[0], profit=0;
        for(int p:prices){
            if(p<mn) mn=p;
            else if(p-mn>profit) profit=p-mn;
        }
        return profit;
    }
}
