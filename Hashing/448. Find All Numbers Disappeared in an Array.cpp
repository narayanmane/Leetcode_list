class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int> v;
        map<int ,int> mp;
        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
        }
       // int i=1;
        for(int i=1;i<=nums.size();i++)
        {
            if(mp[i]!=1 && mp[i]<2)
                v.push_back(i);
        }
        return v;
    }
};
