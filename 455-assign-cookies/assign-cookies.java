class Solution {
    public int findContentChildren(int[] g, int[] s) {
                Arrays.sort(g);
                Arrays.sort(s);
                int c=0;
                int i=0;
                int j=0;
                while(j<g.length && i<s.length){
                    if(g[j]<=s[i]){
                        j++;
                        i++;
                        c++;
                    }
                    else{
                        i++;
                    }
                }
                return c;
    }
}