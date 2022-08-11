class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        map<int,int> mp;
        vector<int>v;
        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
                
        }
        for(auto itr : mp)
        {
            if(itr.second>=2){
                v.push_back(itr.first);
            }
        }
        return v;
        
    }
};
