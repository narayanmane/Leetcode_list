class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int arr=0;
        for(int i=0;i<nums.size();i++)
        {
            if( i<nums.size()-1 && nums[i]==nums[i+1] )
            {
                continue;
            }
            nums[arr]=nums[i];
            arr++;
        }
        return arr;
    }
};
