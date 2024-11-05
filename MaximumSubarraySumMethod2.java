class Solution {
    public int maxSubArray(int[] nums) {
      
      int [] dp= new int[nums.length];
      dp[0]=nums[0];
      int OverallMax=Integer.MIN_VALUE;
        
       for(int i=1; i<nums.length;i++){
           dp[i]= Math.max(dp[i-1]+nums[i], nums[i]);   
       }
       for(int i=0; i<nums.length;i++){  
           OverallMax= Math.max(OverallMax, dp[i]);
       }
        return OverallMax;
        
    }
}
