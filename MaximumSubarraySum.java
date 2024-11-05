class Solution {
    public int maxSubArray(int[] nums) {
        
        int OverallMaxSum= Integer.MIN_VALUE;
        int currSum=0;
        
        for(int i=0; i<nums.length;i++){
            currSum+=nums[i];
            OverallMaxSum= Math.max(OverallMaxSum, currSum);
            
            if(currSum<0){
                currSum=0;
            }
        }
        return OverallMaxSum;
    }
}
