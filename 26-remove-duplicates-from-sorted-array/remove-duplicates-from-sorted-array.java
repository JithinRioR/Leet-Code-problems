class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        TreeSet<Integer> tree=new TreeSet<>(set);
        int i=0;
        for(int num:tree){
            nums[i]=num;
            i++;
        }
        int a=set.size();
        return a;
    }
}