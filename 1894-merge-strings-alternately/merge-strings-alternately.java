class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;int j=0;
        String str="";
        while(i<word1.length()&&j<word2.length()){
            str+=word1.charAt(i);
            str+=word2.charAt(j);
            i++;j++;
        }
        if(word1.length()>word2.length()){
            for(int k=i;k<word1.length();k++){
                str+=word1.charAt(k);
            }
        }
        else{
            for(int k=j;k<word2.length();k++){
                str+=word2.charAt(k);
            }
        }
        return str;
    }
}