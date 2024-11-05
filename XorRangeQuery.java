
 //  https://leetcode.com/problems/xor-queries-of-a-subarray/submissions/
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
       
        int q= queries.length;
        int n= arr.length;
        int [] ans= new int[q];
        int [] prefixXor= new int [n];
        
        prefixXor[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixXor[i]=prefixXor[i-1]^arr[i];
        }
        
        for(int i=0; i<q;i++){
            int l= queries[i][0];
            int r= queries[i][1];
            if(l==0){
                 ans[i]= prefixXor[r];
            }else{
                ans[i]= prefixXor[r]^prefixXor[l-1];
            }
        }
        return ans;
        
    }
}
