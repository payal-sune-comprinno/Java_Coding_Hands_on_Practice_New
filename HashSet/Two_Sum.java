//https://www.geeksforgeeks.org/problems/key-pair5616/1

class Solution {
    boolean twoSum(int arr[], int target) {
       
        Set<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            int complement=target-num;
            if(set.contains(complement))
            {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}