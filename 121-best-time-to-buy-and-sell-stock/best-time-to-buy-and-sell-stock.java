class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        int profit=0;
        int a=0;
        for(int i:prices){
            if(min>=i){
                min=i;
            }
            a=i-min;
            if(a>=max){
                max=a;
            }
        }
        return max;
    }
}