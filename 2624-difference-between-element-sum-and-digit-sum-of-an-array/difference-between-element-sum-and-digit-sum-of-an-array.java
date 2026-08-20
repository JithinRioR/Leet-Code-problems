class Solution {
    public int differenceOfSum(int[] nums) {
        int element=0;
        for(int i=0;i<nums.length;i++){
            element+=nums[i];
        }
        int digits=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
           while(a>0){
            digits+=a%10;
            a=a/10;
           }
        }
        return Math.abs(element-digits);

    }
}