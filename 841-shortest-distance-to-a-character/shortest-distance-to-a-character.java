class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr=new int[s.length()];
        int prev=-s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                prev=i;
            }
            arr[i]=i-prev;
        }
        prev=2*s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c) prev=i;
            arr[i]=Math.min(arr[i],prev-i);
        }
        return arr;
    }
}