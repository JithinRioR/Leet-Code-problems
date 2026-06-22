class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int j=1;j<numbers.length;j++){
            int i=0;
            while(i<j){
                if(numbers[i]+numbers[j]==target){                            
                    return new int[]{i+1,j+1};
                }
                i++;
            }
        }
        return new int[]{-1,-1};
    }
}