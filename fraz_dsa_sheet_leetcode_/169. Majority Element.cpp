class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        return nums[n/2];
        /*map<int,int>m;
        for(int i=0;i<nums.size();i++)
        {
            m.insert(nums[i]);
        }
        for(auto it:m)
            if(it.second>2)
                return it.first;
                */
        
    }
};
