class Solution {
    public int[] runningSum(int[] nums) {
        int [] v= new int[nums.length];
        int su=0;
        for(int i=0;i<nums.length;i++)
        {
            su=su+nums[i];
            v[i]=su;
        }
        return v;
        
    }
}
