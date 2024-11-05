class Solution {
    public int missingNumber(int[] nums) {
     
    int n= nums.length;
    int RangeSum= n*(n+1)/2;
    int ArraySum=0;
        
    for(int i=0; i<n;i++ ){
        ArraySum+=nums[i];
    }
    
    int missingNumber= RangeSum-ArraySum;
        return missingNumber;
        
    }
}
