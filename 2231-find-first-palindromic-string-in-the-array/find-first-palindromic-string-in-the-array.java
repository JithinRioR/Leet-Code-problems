class Solution {
    public String firstPalindrome(String[] words) {
        String st="";
        for(String s:words){
            String str="";
            for(int i=s.length()-1;i>=0;i--){
                str+=s.charAt(i);
            }
            if(str.equals(s)) return str;
        }
        return st;
    }
    
}