#include<bits/stdc++.h>
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        multiset<int> st;
for(int i=0;i<nums.size();i++)
{
st.insert(nums[i]*nums[i]);
}
int k=0;
for(auto it:st)
{
nums[k++]=it;
}
return nums;
       /* vector<int> v(nums.size());
        for(int i=0;i<nums.size();i++)
        {
            nums.push_back(pow(nums[i],2));
        }
       // sort(v.begin(),v.end());
        return nums;*/
    }
};
