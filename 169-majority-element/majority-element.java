class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int a=nums.length/2,b=0;
        int i=0;int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
                b++;
            }
            else{
                i=j;
                j++;
                b=0;
            }
            if(b>=a){
                return nums[i];
            }
            
        }
        return 0;
    }
}