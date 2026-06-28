class Solution {
    public int countSubstrings(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int a=expand(s,i,i,0);
            int b=expand(s,i,i+1,0);
            total += a+b;
           
        }
        return total;
    }
    public int expand(String s,int left,int right,int count){
        while(left>=0 && right>=0 &&left<s.length() && right <s.length() && left<s.length() && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
