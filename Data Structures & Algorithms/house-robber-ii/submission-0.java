class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n<=2) return (n==2) ? Math.max(nums[0],nums[1]) : nums[0];
        int a = steel(nums,0,nums.length-2);
        int b=steel(nums,1,nums.length-1);
        return Math.max(a,b);
    }
    public int steel(int[] nums,int start,int end){
       int currMax=0;
       int prevMax= 0;
       for(int i=start;i<=end;++i){
        int temp = currMax;
        
        currMax=Math.max(currMax,prevMax+nums[i]);
        prevMax =temp;
       }
       return currMax;
    }
}
