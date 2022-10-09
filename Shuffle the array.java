class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = 2*n;
        int[] ans =new int[len];
        int x=0,y=n,a=0;
        while(a<len){
            ans[a++]=nums[x++];
            ans[a++]=nums[y++];
        }
        return ans;
            
            
        
    }
}
