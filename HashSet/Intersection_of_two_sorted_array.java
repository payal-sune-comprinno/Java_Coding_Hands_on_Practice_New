//https://leetcode.com/problems/intersection-of-two-arrays/description/


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> resultset=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        for(int nums:nums2)
        {
            if(set.contains(nums))
            {
                resultset.add(nums);
            }
        }
        int a[]=new int[resultset.size()];
        int k=0;
        for(int num:resultset)
        {
            a[k++]=num;
        }
return a;
    }
}