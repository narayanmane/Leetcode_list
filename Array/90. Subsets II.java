class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> res=new ArrayList();
        Arrays.sort(nums);
        gen(0,nums,new ArrayList(),res);
        return res;
    }
    void gen(int index,int [] nums,List<Integer> curr, List<List<Integer>> res)
    {
         res.add(new ArrayList(curr));
        
        for(int i=index; i<nums.length;i++)
        {   if(i>index && nums[i-1]==nums[i])continue;
            curr.add(nums[i]);
            gen(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
