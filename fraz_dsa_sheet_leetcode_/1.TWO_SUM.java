/-----------------------------java -----------------------------------
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         int[] v=new  int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                   v[0]=i;
                    v[1]=j;
                }
            }
        }
        
        return v;
    }
}

/-----------------------------cpp-------------------------------------
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> v;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    v.push_back(i);
                    v.push_back(j);
                }
            }
        }
        
        return v;
    }
};
