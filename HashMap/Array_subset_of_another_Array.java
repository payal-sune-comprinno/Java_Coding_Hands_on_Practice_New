//https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
            
        }
        for(int i=0;i<b.length;i++)
        {
            if(!map.containsKey(b[i]) || map.get(b[i])==0)
            {
                return false;
            }
            map.put(b[i],map.get(b[i])-1);
        }
        return true;


//         class Solution {
//     public boolean isSubset(int a[], int b[]) {
//         // Your code here
//          Map<Integer,Integer> map1=new HashMap<>();
//         Map<Integer,Integer> map2=new HashMap<>();

//         for(int i=0;i<a.length;i++)
//         {
//             if(map1.containsKey(a[i]))
//             {
//                 map1.put(a[i],map1.get(a[i])+1);
//             }
//             else
//             {
//                 map1.put(a[i],1);
//             }
//         }
//         for(int i=0;i<b.length;i++)
//         {
//             if(!map1.containsKey(b[i]))
//             {
//                 return false;
//             }
//             if(map2.containsKey(b[i]))
//             {
//                 map2.put(b[i],map2.get(b[i])+1);
//             }
//             else
//             {
//                 map2.put(b[i],1);
//             }
//         }
//         for(int ele:map2.keySet())
//         {
//             int freq=map2.get(ele);
//             int freq1=map1.get(ele);
//             if(freq1<freq)
//             {
//                 return false;
//             }

//         }
//         return true;
//     }
// }
    }
}