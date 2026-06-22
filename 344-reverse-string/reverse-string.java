class Solution {
    public void reverseString(char[] s) {
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            if(j!=s.length/2){
                char ch=s[i];
                s[i]=s[j];
                s[j]=ch;
                j++;
            }
        }
        return;
    }
}