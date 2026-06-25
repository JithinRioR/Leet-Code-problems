class Solution {
    public int reverse(int x) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        long n=0;
        while (x != 0) {
            int a = x % 10;
            n=n*10+a;
            x /= 10;
    
        }
        if(n>max||n<min) return 0;
        else return (int)n;
    }
}