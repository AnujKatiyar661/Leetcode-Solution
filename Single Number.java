class Solution {
    public int singleNumber(int[] nums) {
         int xor =0;
        for(int num:nums){
            xor=xor^num;
        }
         
        return xor;
    }
}




// Adding Code of Single Number 2nd in java
class Solution {
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length;i++)
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);            
               
         int result =0;
               
         for(int i: map.keySet())
               {
                   if(map.get(i) == 1)
                       result = i;
               }
               
         return result;
     }
}

