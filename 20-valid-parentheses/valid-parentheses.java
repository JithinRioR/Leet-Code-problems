class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
      //  char peek;
        if(s.length()%2!=0) return false;
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']') return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(ch=='{'||ch=='('||ch=='['){
               stack.push(ch);
           }
           else{
                if(!stack.isEmpty()){
                    if(ch==')'&&stack.peek()=='('||ch=='}'&&stack.peek()=='{'||ch==']'&&stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }

                }
                else if(s.length()!=i+1) return false;            
           }           
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}