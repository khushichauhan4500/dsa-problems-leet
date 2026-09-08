class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actualsum=(n*(n+1))/2;
        int cursum=0;
        for(int i=0;i<n;i++)
        {
            cursum+=nums[i];
        }
        int element=actualsum-cursum;
    
    return element;
}
}
