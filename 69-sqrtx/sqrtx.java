class Solution {
    public int mySqrt(int x) {
         if (x < 2) {
            return x;
        }
        long i = x;
        while (i * i > x) {
            i = (i + x / i) / 2;
        }
        return (int) i;
    }
}