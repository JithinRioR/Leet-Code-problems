class Solution {
    public String reverseVowels(String s) {
        int j=0;char[] cha=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            char ch=cha[i];
            if("AEIOUaeiou".indexOf(ch)!=-1){
                while(j<i){
                    char c=cha[j];
                    if("AEIOUaeiou".indexOf(c)!=-1){
                        char temp=cha[j];
                        cha[j]=cha[i];
                        cha[i]=temp;
                        j++;
                        break;
                    }
                    else{
                        j++;
                    }
                }
            
            }
        }
        s=new String(cha);
        return s;
    }
}