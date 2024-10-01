class Solution {
    
    public void moveZeroes(int[] nums)
    {
     int nonzeros=0;
        int zeros=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[nonzeros]!=0)
            {
                int temp=nums[nonzeros];
                nums[nonzeros]=nums[zeros];
                nums[zeros]=temp;
                zeros++;
            }
            nonzeros++;
        }
        
    }
}