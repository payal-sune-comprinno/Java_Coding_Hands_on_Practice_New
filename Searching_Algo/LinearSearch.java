class LinearSearch {
    public int search(int arr[], int x) {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={23,45,6,7,11};
        LinearSearch l1=new LinearSearch();
        int u=l1.search(arr,6);
        System.out.println(u);
    }
}
