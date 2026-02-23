//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1


class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        TreeSet<Integer> set1=new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        for(int num:a)
        {
            set1.add(num);
        }
        for(int nums:b)
        {
            set1.add(nums);
        }
        
        for(int x:set1)
        {
            arr.add(x);
        }
        return arr;
    }
}
