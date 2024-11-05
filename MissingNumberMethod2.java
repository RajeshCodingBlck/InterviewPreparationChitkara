class Solution {
    public int missingNumber(int[] nums) {
     
        int n= nums.length;
        int RangeXor=0;
        for(int i=1;i<=n;i++){
            RangeXor= RangeXor^i;
        }
        int ArrayXor=0;
        for(int i=0; i<n;i++){
            ArrayXor^=nums[i];
        }
        
        return RangeXor^ArrayXor;
        
    }
}
