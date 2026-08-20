class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MIN_VALUE;
        int i=0;
        boolean b=true;
        while(i<prices.length-1){
            for(int k=i+1;k<prices.length;k++){
                if(prices[i]+prices[k]<=money){
                    min=Math.max(min,money-prices[i]-prices[k]);
                    b=false;
                }
            }
            i++;
        }
        if(b) return money;
        else return min;
    }
}