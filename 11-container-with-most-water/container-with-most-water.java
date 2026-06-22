class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int min=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int length=j-i;
            min=Math.min(height[i],height[j]);
            int area=length*min;
            max=Math.max(max,area);
            if(height[j]<=height[i]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}