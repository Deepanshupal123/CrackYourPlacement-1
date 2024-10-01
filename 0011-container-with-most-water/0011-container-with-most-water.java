class Solution {
    public int maxArea(int[] height) 
    {
        int rp=height.length-1;
        int lp=0;
        int max=0;
        while(lp<rp)
        {
            int h=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int area=h*width;
            max=Math.max(max,area);
            if(height[lp]<height[rp])
            {
                lp++;
            }
            else
            {
                rp--;
            }

        }
        return max;
        
    }
}