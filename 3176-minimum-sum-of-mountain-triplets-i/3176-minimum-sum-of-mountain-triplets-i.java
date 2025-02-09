class Solution {
    public int minimumSum(int[] nums) {

        int n=nums.length;
        int sum=0;
        int minNum=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(i<j &&j<k &&nums[i]<nums[j]&&nums[k]<nums[j])
                    {
                        sum=nums[i]+nums[j]+nums[k];
                        minNum=Math.min(minNum,sum);
                    }
                }
            }
        }
        if (minNum == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minNum;
        }
    }
}