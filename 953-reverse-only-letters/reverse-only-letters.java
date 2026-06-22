class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if((arr[j]>='A'&&arr[j]<='Z'||arr[j]>='a'&&arr[j]<='z')&&(arr[i]>='A'&&arr[i]<='Z'||arr[i]>='a'&&arr[i]<='z')){
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
            else if(arr[i]>='A'&&arr[i]<='Z'||arr[i]>='a'&&arr[i]<='z'){
                j--;
            }
            else if(arr[j]>='A'&&arr[j]<='Z'||arr[j]>='a'&&arr[j]<='z'){
                i++;
            }
            else{
                i++;j--;
            }
        }
        s=new String(arr);
        return s;
    }
}